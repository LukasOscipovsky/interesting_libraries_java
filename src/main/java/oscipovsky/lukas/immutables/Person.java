package oscipovsky.lukas.immutables;

import org.immutables.value.Value;

@Value.Immutable
public abstract class Person {
    abstract String getName();
    abstract Integer getAge();

    public static void main(String... args) {
        ImmutablePerson john = ImmutablePerson.builder()
                .age(42)
                .name("John")
                .build();

        System.out.println(john);
    }
}
