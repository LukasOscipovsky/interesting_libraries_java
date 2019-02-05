package oscipovsky.lukas.immutables;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link NullableExample}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNullableExample.builder()}.
 */
@Generated(from = "NullableExample", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Immutable
@CheckReturnValue
public final class ImmutableNullableExample implements NullableExample {
  private final @Nullable Integer i1;

  private ImmutableNullableExample(@Nullable Integer i1) {
    this.i1 = i1;
  }

  /**
   * @return The value of the {@code i1} attribute
   */
  @Override
  public @Nullable Integer i1() {
    return i1;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NullableExample#i1() i1} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for i1 (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNullableExample withI1(@Nullable Integer value) {
    if (Objects.equals(this.i1, value)) return this;
    return new ImmutableNullableExample(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNullableExample} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNullableExample
        && equalTo((ImmutableNullableExample) another);
  }

  private boolean equalTo(ImmutableNullableExample another) {
    return Objects.equals(i1, another.i1);
  }

  /**
   * Computes a hash code from attributes: {@code i1}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + Objects.hashCode(i1);
    return h;
  }

  /**
   * Prints the immutable value {@code NullableExample} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("NullableExample")
        .omitNullValues()
        .add("i1", i1)
        .toString();
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
   * <pre>
   * ImmutableNullableExample.builder()
   *    .i1(Integer | null) // nullable {@link NullableExample#i1() i1}
   *    .build();
   * </pre>
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
  @Generated(from = "NullableExample", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private @Nullable Integer i1;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code NullableExample} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(NullableExample instance) {
      Objects.requireNonNull(instance, "instance");
      @Nullable Integer i1Value = instance.i1();
      if (i1Value != null) {
        i1(i1Value);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link NullableExample#i1() i1} attribute.
     * @param i1 The value for i1 (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder i1(@Nullable Integer i1) {
      this.i1 = i1;
      return this;
    }

    /**
     * Builds a new {@link ImmutableNullableExample ImmutableNullableExample}.
     * @return An immutable instance of NullableExample
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableNullableExample build() {
      return new ImmutableNullableExample(i1);
    }
  }
}
