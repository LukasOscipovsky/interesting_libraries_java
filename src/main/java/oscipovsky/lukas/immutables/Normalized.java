package oscipovsky.lukas.immutables;

import org.immutables.value.Value;


@Value.Immutable
public interface Normalized {
    int value();

    @Value.Check
    default Normalized normalize() {
        if (value() == Integer.MIN_VALUE) {
            return ImmutableNormalized.builder()
                    .value(0)
                    .build();
        }
        if (value() < 0) {
            return ImmutableNormalized.builder()
                    .value(-value())
                    .build();
        }
        return this;
    }

    public static void main(String... args) {
        int value = ImmutableNormalized.builder().value(-2).build().value();
        System.out.println(value);

        ImmutableNormalized.copyOf(ImmutableNormalized.builder().build());
    }
}
