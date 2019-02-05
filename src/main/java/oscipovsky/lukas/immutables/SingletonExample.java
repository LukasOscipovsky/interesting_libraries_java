package oscipovsky.lukas.immutables;

import org.immutables.value.Value;

import java.util.Set;

@Value.Immutable(singleton = true)
public abstract class SingletonExample {
    public abstract Set<String> chunks();

    public static void main (String... args) {
        System.out.println(ImmutableSingletonExample.of() == ImmutableSingletonExample.builder().build());
        System.out.println(ImmutableSingletonExample.of().chunks().isEmpty());
    }
}
