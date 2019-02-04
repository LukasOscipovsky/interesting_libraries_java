package oscipovsky.lukas.immutables;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Car}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCar.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableCar.create()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "Car"})
public final class ImmutableCar extends Car {
  private final String name;
  private final String brand;
  private final String color;

  private ImmutableCar(String name, String brand, String color) {
    this.name = Objects.requireNonNull(name, "name");
    this.brand = Objects.requireNonNull(brand, "brand");
    this.color = Objects.requireNonNull(color, "color");
  }

  private ImmutableCar(ImmutableCar original, String name, String brand, String color) {
    this.name = name;
    this.brand = brand;
    this.color = color;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  String getName() {
    return name;
  }

  /**
   * @return The value of the {@code brand} attribute
   */
  @Override
  String getBrand() {
    return brand;
  }

  /**
   * @return The value of the {@code color} attribute
   */
  @Override
  String getColor() {
    return color;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Car#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param name A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCar withName(String name) {
    if (this.name.equals(name)) return this;
    String newValue = Objects.requireNonNull(name, "name");
    return new ImmutableCar(this, newValue, this.brand, this.color);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Car#getBrand() brand} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param brand A new value for brand
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCar withBrand(String brand) {
    if (this.brand.equals(brand)) return this;
    String newValue = Objects.requireNonNull(brand, "brand");
    return new ImmutableCar(this, this.name, newValue, this.color);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Car#getColor() color} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param color A new value for color
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCar withColor(String color) {
    if (this.color.equals(color)) return this;
    String newValue = Objects.requireNonNull(color, "color");
    return new ImmutableCar(this, this.name, this.brand, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCar} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCar
        && equalTo((ImmutableCar) another);
  }

  private boolean equalTo(ImmutableCar another) {
    return name.equals(another.name)
        && brand.equals(another.brand)
        && color.equals(another.color);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code brand}, {@code color}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + name.hashCode();
    h = h * 17 + brand.hashCode();
    h = h * 17 + color.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Car} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Car{"
        + "name=" + name
        + ", brand=" + brand
        + ", color=" + color
        + "}";
  }

  /**
   * Construct a new immutable {@code Car} instance.
   * @param name The value for the {@code name} attribute
   * @param brand The value for the {@code brand} attribute
   * @param color The value for the {@code color} attribute
   * @return An immutable Car instance
   */
  public static ImmutableCar create(String name, String brand, String color) {
    return new ImmutableCar(name, brand, color);
  }

  /**
   * Creates an immutable copy of a {@link Car} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Car instance
   */
  public static ImmutableCar copyOf(Car instance) {
    if (instance instanceof ImmutableCar) {
      return (ImmutableCar) instance;
    }
    return ImmutableCar.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCar ImmutableCar}.
   * @return A new ImmutableCar builder
   */
  public static ImmutableCar.Builder builder() {
    return new ImmutableCar.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCar ImmutableCar}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_BRAND = 0x2L;
    private static final long INIT_BIT_COLOR = 0x4L;
    private long initBits = 0x7L;

    private String name;
    private String brand;
    private String color;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Car} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Car instance) {
      Objects.requireNonNull(instance, "instance");
      name(instance.getName());
      brand(instance.getBrand());
      color(instance.getColor());
      return this;
    }

    /**
     * Initializes the value for the {@link Car#getName() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Car#getBrand() brand} attribute.
     * @param brand The value for brand 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder brand(String brand) {
      this.brand = Objects.requireNonNull(brand, "brand");
      initBits &= ~INIT_BIT_BRAND;
      return this;
    }

    /**
     * Initializes the value for the {@link Car#getColor() color} attribute.
     * @param color The value for color 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder color(String color) {
      this.color = Objects.requireNonNull(color, "color");
      initBits &= ~INIT_BIT_COLOR;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCar ImmutableCar}.
     * @return An immutable instance of Car
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCar build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCar(null, name, brand, color);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<String>();
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_BRAND) != 0) attributes.add("brand");
      if ((initBits & INIT_BIT_COLOR) != 0) attributes.add("color");
      return "Cannot build Car, some of required attributes are not set " + attributes;
    }
  }
}
