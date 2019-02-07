package oscipovsky.lukas.immutables;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Normalized}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNormalized.builder()}.
 */
@Generated(from = "Normalized", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableNormalized implements Normalized {
  private final int value;

  private ImmutableNormalized(int value) {
    this.value = value;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @Override
  public int value() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Normalized#value() value} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNormalized withValue(int value) {
    if (this.value == value) return this;
    return validate(new ImmutableNormalized(value));
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNormalized} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNormalized
        && equalTo((ImmutableNormalized) another);
  }

  private boolean equalTo(ImmutableNormalized another) {
    return value == another.value;
  }

  /**
   * Computes a hash code from attributes: {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + value;
    return h;
  }

  /**
   * Prints the immutable value {@code Normalized} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Normalized")
        .omitNullValues()
        .add("value", value)
        .toString();
  }

  private static ImmutableNormalized validate(ImmutableNormalized instance) {
    instance = (ImmutableNormalized) instance.normalize();
    return instance;
  }

  /**
   * Creates an immutable copy of a {@link Normalized} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Normalized instance
   */
  public static ImmutableNormalized copyOf(Normalized instance) {
    if (instance instanceof ImmutableNormalized) {
      return (ImmutableNormalized) instance;
    }
    return ImmutableNormalized.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableNormalized ImmutableNormalized}.
   * <pre>
   * ImmutableNormalized.builder()
   *    .value(int) // required {@link Normalized#value() value}
   *    .build();
   * </pre>
   * @return A new ImmutableNormalized builder
   */
  public static ImmutableNormalized.Builder builder() {
    return new ImmutableNormalized.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableNormalized ImmutableNormalized}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Normalized", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_VALUE = 0x1L;
    private long initBits = 0x1L;

    private int value;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Normalized} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Normalized instance) {
      Objects.requireNonNull(instance, "instance");
      value(instance.value());
      return this;
    }

    /**
     * Initializes the value for the {@link Normalized#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder value(int value) {
      this.value = value;
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableNormalized ImmutableNormalized}.
     * @return An immutable instance of Normalized
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableNormalized build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return ImmutableNormalized.validate(new ImmutableNormalized(value));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      return "Cannot build Normalized, some of required attributes are not set " + attributes;
    }
  }
}
