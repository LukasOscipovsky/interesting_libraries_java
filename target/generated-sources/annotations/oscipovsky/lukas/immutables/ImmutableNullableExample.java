package oscipovsky.lukas.immutables;

import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link NullableExample}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNullableExample.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "NullableExample"})
public final class ImmutableNullableExample implements NullableExample {

  private ImmutableNullableExample(ImmutableNullableExample.Builder builder) {
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNullableExample} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNullableExample
        && equalTo((ImmutableNullableExample) another);
  }

  private boolean equalTo(ImmutableNullableExample another) {
    return true;
  }

  /**
   * Returns a constant hash code value.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    return -304372225;
  }

  /**
   * Prints the immutable value {@code NullableExample}.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "NullableExample{}";
  }

  /**
   * Creates an immutable copy of a {@link NullableExample} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NullableExample instance
   */
  public static ImmutableNullableExample copyOf(NullableExample instance) {
    if (instance instanceof ImmutableNullableExample) {
      return (ImmutableNullableExample) instance;
    }
    return ImmutableNullableExample.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableNullableExample ImmutableNullableExample}.
   * @return A new ImmutableNullableExample builder
   */
  public static ImmutableNullableExample.Builder builder() {
    return new ImmutableNullableExample.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableNullableExample ImmutableNullableExample}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code NullableExample} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(NullableExample instance) {
      Objects.requireNonNull(instance, "instance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableNullableExample ImmutableNullableExample}.
     * @return An immutable instance of NullableExample
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableNullableExample build() {
      return new ImmutableNullableExample(this);
    }
  }
}
