package oscipovsky.lukas.immutables;

import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link CollectionExample}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCollectionExample.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "CollectionExample"})
public final class ImmutableCollectionExample implements CollectionExample {

  private ImmutableCollectionExample(ImmutableCollectionExample.Builder builder) {
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCollectionExample} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCollectionExample
        && equalTo((ImmutableCollectionExample) another);
  }

  private boolean equalTo(ImmutableCollectionExample another) {
    return true;
  }

  /**
   * Returns a constant hash code value.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    return -334651806;
  }

  /**
   * Prints the immutable value {@code CollectionExample}.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "CollectionExample{}";
  }

  /**
   * Creates an immutable copy of a {@link CollectionExample} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CollectionExample instance
   */
  public static ImmutableCollectionExample copyOf(CollectionExample instance) {
    if (instance instanceof ImmutableCollectionExample) {
      return (ImmutableCollectionExample) instance;
    }
    return ImmutableCollectionExample.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCollectionExample ImmutableCollectionExample}.
   * @return A new ImmutableCollectionExample builder
   */
  public static ImmutableCollectionExample.Builder builder() {
    return new ImmutableCollectionExample.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCollectionExample ImmutableCollectionExample}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CollectionExample} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CollectionExample instance) {
      Objects.requireNonNull(instance, "instance");
      return this;
    }

    /**
     * Builds a new {@link ImmutableCollectionExample ImmutableCollectionExample}.
     * @return An immutable instance of CollectionExample
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCollectionExample build() {
      return new ImmutableCollectionExample(this);
    }
  }
}
