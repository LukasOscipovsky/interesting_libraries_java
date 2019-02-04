package oscipovsky.lukas.immutables;

import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
public abstract class OptionalExample {
    abstract Optional<String> getName();

    public static void main(String... args) {
        ImmutableOptionalExample.builder().name("").name(Optional.of("")).build();
    }
}
