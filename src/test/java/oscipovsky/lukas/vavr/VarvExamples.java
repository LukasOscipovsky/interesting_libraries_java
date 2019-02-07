package oscipovsky.lukas.vavr;


import io.vavr.API;
import io.vavr.Function0;
import io.vavr.Function1;
import io.vavr.Function6;
import io.vavr.Lazy;
import io.vavr.Predicates;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.collection.List;
import io.vavr.collection.Stream;
import io.vavr.control.Either;
import io.vavr.control.Option;
import io.vavr.control.Try;
import lombok.experimental.ExtensionMethod;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.NoSuchElementException;
import java.util.function.Supplier;

import static io.vavr.API.*;

public class VarvExamples {

    @Test
    public void functionTest() throws Exception {
        Function0 f0 = Function0.constant(1);
        System.out.println(f0.apply());

        System.out.println(Function1.of(String::valueOf).apply(2));

        Function6<Integer, Integer, Integer, Integer, Integer, Integer, Integer> f6 = (a,b,c,d,e,f) -> a + b + c + d + e + f;
        Function1<Integer, Integer> f11 = a -> a + 1;

        System.out.println(f6.andThen(f11).apply(1,2,3,4,5,6));
    }

    @Test
    public void listTest() throws Exception {
        List<String> integers = List.ofAll(1, 2, 3).dropRightUntil(i -> i < 3).map(String::valueOf);
        System.out.println(integers);
    }

    @Test
    public void optionTest() throws Exception {
        String option1 = Option.of("42").map(String::toUpperCase)
                .filter(s -> s.endsWith("3"))
                //.get(); NoSuchElementExc
                .getOrElse("0");
        System.out.println(option1);

        List<Integer> options = List.of(Option.of(1), Option.of(2)).flatMap(o -> o);
        System.out.println(options);
    }

    @Test
    public void tryTest() throws Exception {
        Integer tryTest = Try.of(() -> Option.of(10).filter(i -> i < 15).get())
                .map(j -> j + 1)
                .filter(j -> j < 8).getOrElse(5);
        System.out.println(tryTest);

        System.out.println(Try.of(() -> {
            throw new Exception("abc");
        })
                .recover(Exception.class, 1)
                .get());
    }

    @Test
    public void lazyTest() throws Exception {
        Supplier<Integer> s = () -> {
            System.out.println("computing supplier...");
            return 42;
        };

        s.get();
        s.get();
        s.get();

        ////

        Lazy<Integer> l = Lazy.of(() -> {
            System.out.println("computing lazy...");
            return 42;
        }).map(i -> i + 1);

        System.out.println(l.get());
        l.get();
        l.get();

        ////

        List<Integer> list = List.of(1,2,3);
        System.out.println("appending...");
        list.append(4);

        if (list.isEmpty()) {
            System.out.println(list);
        }

        Lazy<List<Integer>> example = Lazy.of(() -> {
            System.out.println("appending...");
            list.append(5);
            return list;
        });

        if (list.isEmpty()) {
            System.out.println(example.get());
        }
    }

    @Test
    public void testCollection() {
        List<Integer> l = List.of(1, 2, 3);
        l.crossProduct(1).forEach(System.out::println);

        System.out.println(l.zipWithIndex());

        java.util.List<Integer> l1 = l.asJavaMutable();
        l1.add(5);
        System.out.println(l1);
    }

    @Test
    public void streamTest() {
        Stream<Integer> integers = Stream.iterate(0, i -> i + 1).take(10);

        integers.forEach(System.out::println);
        integers.forEach(System.out::println);

        java.util.stream.Stream<Integer> iterate2 = java.util.stream.Stream.iterate(0, i -> i + 1).limit(10);

        iterate2.forEach(System.out::println);
        iterate2.forEach(System.out::println);
    }

    @Test
    public void tupleTest() {
        Tuple2<String, Integer> tuple = Tuple.of("Java", 11);
        tuple._1();

        String apply = tuple.apply((s, i) -> s + i);
        System.out.println(apply);

        int arity = tuple.map((s, i) -> Tuple.of(s + "c", 11 + 1)).concat(Tuple.of(2654651618614616l)).arity();
        System.out.println(arity);
    }

    @Test
    public void sneakyThrowsTest() {
        List.of("").map(unchecked(s -> new URI(s)));
    }

    @Test
    public void matchTest() {
        Object a = "42";

        System.out.println(Match(a).of(
                Case($(Predicates.instanceOf(String.class)), "string"),
                Case($(Predicates.instanceOf(Integer.class)), "int")));
    }

    @Test
    public void eitherTest() {
        Either<String, Integer> either = computeWithEither(10);

        System.out.println(either.isLeft());
        System.out.println(either.contains(10));

        System.out.println(either.map(i -> i + 1));
        System.out.println(either.swap());

        System.out.println(either.getOrElse(5));

        System.out.println(either.filter(i -> i < 10)); // None or Some

        Either<String, Integer> left = Either.right(1);
        left = Either.left("42");

        System.out.println(left.map(i -> i + 1));

        System.out.println(left.fold(i -> i, Object::toString));


    }

    private static Either<String, Integer> computeWithEither(int marks) {
        if (marks < 85) {
            return Either.left("Marks not acceptable");
        } else {
            return Either.right(marks);
        }
    }

}
