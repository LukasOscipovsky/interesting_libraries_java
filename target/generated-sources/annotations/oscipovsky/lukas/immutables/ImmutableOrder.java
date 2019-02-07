package oscipovsky.lukas.immutables;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
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
 * Immutable implementation of {@link Order}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOrder.builder()}.
 */
@Generated(from = "Order", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableOrder extends Order {
  private final ImmutableList<Item> items;
  private transient final int totalCount;

  private ImmutableOrder(ImmutableList<Item> items) {
    this.items = items;
    this.totalCount = super.totalCount();
  }

  /**
   * @return The value of the {@code items} attribute
   */
  @Override
  public ImmutableList<Item> items() {
    return items;
  }

  /**
   * @return The computed-at-construction value of the {@code totalCount} attribute
   */
  @Override
  public int totalCount() {
    return totalCount;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Order#items() items}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrder withItems(Item... elements) {
    ImmutableList<Item> newValue = ImmutableList.copyOf(elements);
    return new ImmutableOrder(newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Order#items() items}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of items elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrder withItems(Iterable<? extends Item> elements) {
    if (this.items == elements) return this;
    ImmutableList<Item> newValue = ImmutableList.copyOf(elements);
    return new ImmutableOrder(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOrder} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOrder
        && equalTo((ImmutableOrder) another);
  }

  private boolean equalTo(ImmutableOrder another) {
    return items.equals(another.items)
        && totalCount == another.totalCount;
  }

  /**
   * Computes a hash code from attributes: {@code items}, {@code totalCount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + items.hashCode();
    h += (h << 5) + totalCount;
    return h;
  }

  /**
   * Prints the immutable value {@code Order} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Order")
        .omitNullValues()
        .add("items", items)
        .add("totalCount", totalCount)
        .toString();
  }

  @SuppressWarnings("Immutable")
  private transient volatile long lazyInitBitmap;

  private static final long TOTAL_COST_LAZY_INIT_BIT = 0x1L;

  @SuppressWarnings("Immutable")
  private transient int totalCost;

  /**
   * {@inheritDoc}
   * <p>
   * Returns a lazily initialized value of the {@link Order#totalCost() totalCost} attribute.
   * Initialized once and only once and stored for subsequent access with proper synchronization.
   * In case of any exception or error thrown by the lazy value initializer,
   * the result will not be memoised (i.e. remembered) and on next call computation
   * will be attempted again.
   * @return A lazily initialized value of the {@code totalCost} attribute
   */
  @Override
  public int totalCost() {
    if ((lazyInitBitmap & TOTAL_COST_LAZY_INIT_BIT) == 0) {
      synchronized (this) {
        if ((lazyInitBitmap & TOTAL_COST_LAZY_INIT_BIT) == 0) {
          this.totalCost = super.totalCost();
          lazyInitBitmap |= TOTAL_COST_LAZY_INIT_BIT;
        }
      }
    }
    return totalCost;
  }

  /**
   * Creates an immutable copy of a {@link Order} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Order instance
   */
  public static ImmutableOrder copyOf(Order instance) {
    if (instance instanceof ImmutableOrder) {
      return (ImmutableOrder) instance;
    }
    return ImmutableOrder.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableOrder ImmutableOrder}.
   * <pre>
   * ImmutableOrder.builder()
   *    .addItems|addAllItems(oscipovsky.lukas.immutables.Item) // {@link Order#items() items} elements
   *    .build();
   * </pre>
   * @return A new ImmutableOrder builder
   */
  public static ImmutableOrder.Builder builder() {
    return new ImmutableOrder.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableOrder ImmutableOrder}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Order", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<Item> items = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Order} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Order instance) {
      Objects.requireNonNull(instance, "instance");
      addAllItems(instance.items());
      return this;
    }

    /**
     * Adds one element to {@link Order#items() items} list.
     * @param element A items element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addItems(Item element) {
      this.items.add(element);
      return this;
    }

    /**
     * Adds elements to {@link Order#items() items} list.
     * @param elements An array of items elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addItems(Item... elements) {
      this.items.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link Order#items() items} list.
     * @param elements An iterable of items elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder items(Iterable<? extends Item> elements) {
      this.items = ImmutableList.builder();
      return addAllItems(elements);
    }

    /**
     * Adds elements to {@link Order#items() items} list.
     * @param elements An iterable of items elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllItems(Iterable<? extends Item> elements) {
      this.items.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableOrder ImmutableOrder}.
     * @return An immutable instance of Order
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableOrder build() {
      return new ImmutableOrder(items.build());
    }
  }
}
