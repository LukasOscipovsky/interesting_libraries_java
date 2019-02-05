package oscipovsky.lukas.immutables;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;
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
 * Immutable implementation of {@link SingletonExample}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSingletonExample.builder()}.
 * Use the static factory method to get the default singleton instance:
 * {@code ImmutableSingletonExample.of()}.
 */
@Generated(from = "SingletonExample", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Immutable
@CheckReturnValue
public final class ImmutableSingletonExample extends SingletonExample {
  private final ImmutableSet<String> chunks;

  private ImmutableSingletonExample() {
    this.chunks = ImmutableSet.of();
  }

  private ImmutableSingletonExample(ImmutableSet<String> chunks) {
    this.chunks = chunks;
  }

  /**
   * @return The value of the {@code chunks} attribute
   */
  @Override
  public ImmutableSet<String> chunks() {
    return chunks;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SingletonExample#chunks() chunks}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSingletonExample withChunks(String... elements) {
    ImmutableSet<String> newValue = ImmutableSet.copyOf(elements);
    return validate(new ImmutableSingletonExample(newValue));
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link SingletonExample#chunks() chunks}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of chunks elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSingletonExample withChunks(Iterable<String> elements) {
    if (this.chunks == elements) return this;
    ImmutableSet<String> newValue = ImmutableSet.copyOf(elements);
    return validate(new ImmutableSingletonExample(newValue));
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSingletonExample} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSingletonExample
        && equalTo((ImmutableSingletonExample) another);
  }

  private boolean equalTo(ImmutableSingletonExample another) {
    return chunks.equals(another.chunks);
  }

  /**
   * Computes a hash code from attributes: {@code chunks}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + chunks.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code SingletonExample} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SingletonExample")
        .omitNullValues()
        .add("chunks", chunks)
        .toString();
  }

  private static final ImmutableSingletonExample INSTANCE = validate(new ImmutableSingletonExample());

  /**
   * Returns the default immutable singleton value of {@code SingletonExample}
   * @return An immutable instance of SingletonExample
   */
  public static ImmutableSingletonExample of() {
    return INSTANCE;
  }

  private static ImmutableSingletonExample validate(ImmutableSingletonExample instance) {
    return INSTANCE != null && INSTANCE.equalTo(instance) ? INSTANCE : instance;
  }

  /**
   * Creates an immutable copy of a {@link SingletonExample} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SingletonExample instance
   */
  public static ImmutableSingletonExample copyOf(SingletonExample instance) {
    if (instance instanceof ImmutableSingletonExample) {
      return (ImmutableSingletonExample) instance;
    }
    return ImmutableSingletonExample.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSingletonExample ImmutableSingletonExample}.
   * <pre>
   * ImmutableSingletonExample.builder()
   *    .addChunks|addAllChunks(String) // {@link SingletonExample#chunks() chunks} elements
   *    .build();
   * </pre>
   * @return A new ImmutableSingletonExample builder
   */
  public static ImmutableSingletonExample.Builder builder() {
    return new ImmutableSingletonExample.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSingletonExample ImmutableSingletonExample}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SingletonExample", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private ImmutableSet.Builder<String> chunks = ImmutableSet.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SingletonExample} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(SingletonExample instance) {
      Objects.requireNonNull(instance, "instance");
      addAllChunks(instance.chunks());
      return this;
    }

    /**
     * Adds one element to {@link SingletonExample#chunks() chunks} set.
     * @param element A chunks element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addChunks(String element) {
      this.chunks.add(element);
      return this;
    }

    /**
     * Adds elements to {@link SingletonExample#chunks() chunks} set.
     * @param elements An array of chunks elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addChunks(String... elements) {
      this.chunks.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link SingletonExample#chunks() chunks} set.
     * @param elements An iterable of chunks elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder chunks(Iterable<String> elements) {
      this.chunks = ImmutableSet.builder();
      return addAllChunks(elements);
    }

    /**
     * Adds elements to {@link SingletonExample#chunks() chunks} set.
     * @param elements An iterable of chunks elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllChunks(Iterable<String> elements) {
      this.chunks.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableSingletonExample ImmutableSingletonExample}.
     * @return An immutable instance of SingletonExample
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSingletonExample build() {
      return ImmutableSingletonExample.validate(new ImmutableSingletonExample(chunks.build()));
    }
  }
}
