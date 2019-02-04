package oscipovsky.lukas.immutables;

import org.immutables.value.Value;

@Value.Immutable
public interface NullableExample {
   // @Nullable Integer i1();

    public static void main(String... args) {
        //ImmutableNullableExample.builder().i1(null).build();
    }
}
