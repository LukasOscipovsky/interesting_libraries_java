package oscipovsky.lukas.immutables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Order}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOrder.builder()}.
 */
@SuppressWarnings("all")
@Generated({"Immutables.generator", "Order"})
public final class ImmutableOrder extends Order {
  private final List<Item> items;
  private final int totalCount;

  private ImmutableOrder(List<Item> items) {
    this.items = items;
    this.totalCount = super.totalCount();
  }

  /**
   * @return The value of the {@code items} attribute
   */
  @Override
  public List<Item> items() {
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
    List<Item> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
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
    List<Item> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableOrder(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOrder} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
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
    int h = 31;
    h = h * 17 + items.hashCode();
    h = h * 17 + totalCount;
    return h;
  }

  /**
   * Prints the immutable value {@code Order} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Order{"
        + "items=" + items
        + ", totalCount=" + totalCount
        + "}";
  }

  private volatile long lazyInitBitmap;

  private static final long TOTAL_COST_LAZY_INIT_BIT = 0x1L;

  private int totalCost;

  /**
   * {@inheritDoc}
   * <p>
   * Returns a lazily initialized value of the {@link Order#totalCost() totalCost} attribute.
   * Initialized once and only once and stored for subsequent access with proper synchronization.
   * @return A lazily initialized value of the {@code l.name} attribute
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
  public static final class Builder {
    private List<Item> items = new ArrayList<Item>();

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
    public final Builder addItems(Item element) {
      this.items.add(Objects.requireNonNull(element, "items element"));
      return this;
    }

    /**
     * Adds elements to {@link Order#items() items} list.
     * @param elements An array of items elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addItems(Item... elements) {
      for (Item element : elements) {
        this.items.add(Objects.requireNonNull(element, "items element"));
      }
      return this;
    }

    /**
     * Sets or replaces all elements for {@link Order#items() items} list.
     * @param elements An iterable of items elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder items(Iterable<? extends Item> elements) {
      this.items.clear();
      return addAllItems(elements);
    }

    /**
     * Adds elements to {@link Order#items() items} list.
     * @param elements An iterable of items elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllItems(Iterable<? extends Item> elements) {
      for (Item element : elements) {
        this.items.add(Objects.requireNonNull(element, "items element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableOrder ImmutableOrder}.
     * @return An immutable instance of Order
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableOrder build() {
      return new ImmutableOrder(createUnmodifiableList(true, items));
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<T>();
    } else {
      list = new ArrayList<T>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<T>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
