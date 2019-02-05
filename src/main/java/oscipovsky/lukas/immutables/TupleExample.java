package oscipovsky.lukas.immutables;

import org.immutables.fixture.style.Tuple;
import org.immutables.value.Value;

@Value.Immutable
@Tuple
public interface TupleExample {
    int a();
    int b();

    public static void main(String... args) {
        TupleExampleTuple of = TupleExampleTuple.of(1, 2);
        System.out.println(of);
    }
}
