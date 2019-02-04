package oscipovsky.lukas.immutables;

import java.util.Objects;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link OptionalExample}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOptionalExample.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "OptionalExample"})
public final class ImmutableOptionalExample extends OptionalExample {
  private final String name;

  private ImmutableOptionalExample(String name) {
    this.name = name;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  Optional<String> getName() {
    return Optional.ofNullable(name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OptionalExample#getName() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOptionalExample withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableOptionalExample(newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OptionalExample#getName() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOptionalExample withName(Optional<String> optional) {
    String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableOptionalExample(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOptionalExample} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOptionalExample
        && equalTo((ImmutableOptionalExample) another);
  }

  private boolean equalTo(ImmutableOptionalExample another) {
    return Objects.equals(name, another.name);
  }

  /**
   * Computes a hash code from attributes: {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + Objects.hashCode(name);
    return h;
  }

  /**
   * Prints the immutable value {@code OptionalExample} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("OptionalExample{");
    if (name != null) {
      builder.append("name=").append(name);
    }
    return builder.append("}").toString();
  }

  /**
   * Creates an immutable copy of a {@link OptionalExample} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OptionalExample instance
   */
  public static ImmutableOptionalExample copyOf(OptionalExample instance) {
    if (instance instanceof ImmutableOptionalExample) {
      return (ImmutableOptionalExample) instance;
    }
    return ImmutableOptionalExample.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableOptionalExample ImmutableOptionalExample}.
   * @return A new ImmutableOptionalExample builder
   */
  public static ImmutableOptionalExample.Builder builder() {
    return new ImmutableOptionalExample.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableOptionalExample ImmutableOptionalExample}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private String name;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code OptionalExample} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(OptionalExample instance) {
      Objects.requireNonNull(instance, "instance");
      Optional<String> nameOptional = instance.getName();
      if (nameOptional.isPresent()) {
        name(nameOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link OptionalExample#getName() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      return this;
    }

    /**
     * Initializes the optional value {@link OptionalExample#getName() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(Optional<String> name) {
      this.name = name.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link ImmutableOptionalExample ImmutableOptionalExample}.
     * @return An immutable instance of OptionalExample
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableOptionalExample build() {
      return new ImmutableOptionalExample(name);
    }
  }
}
