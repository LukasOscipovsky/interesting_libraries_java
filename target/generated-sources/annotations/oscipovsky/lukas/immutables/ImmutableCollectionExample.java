package oscipovsky.lukas.immutables;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.fixture.nullable.AllowNulls;
import org.immutables.fixture.nullable.SkipNulls;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link CollectionExample}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCollectionExample.builder()}.
 */
@Generated(from = "CollectionExample", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Immutable
@CheckReturnValue
public final class ImmutableCollectionExample implements CollectionExample {
  private final java.util.@AllowNulls List<String> a;
  private final java.util.@SkipNulls List<String> b;
  private final java.util.@AllowNulls Map<Integer, String> c;
  private final java.util.@SkipNulls Map<Integer, String> d;

  private ImmutableCollectionExample(
      java.util.@AllowNulls List<String> a,
      java.util.@SkipNulls List<String> b,
      java.util.@AllowNulls Map<Integer, String> c,
      java.util.@SkipNulls Map<Integer, String> d) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
  }

  /**
   * @return The value of the {@code a} attribute
   */
  @Override
  public java.util.@AllowNulls List<String> a() {
    return a;
  }

  /**
   * @return The value of the {@code b} attribute
   */
  @Override
  public java.util.@SkipNulls List<String> b() {
    return b;
  }

  /**
   * @return The value of the {@code c} attribute
   */
  @Override
  public java.util.@AllowNulls Map<Integer, String> c() {
    return c;
  }

  /**
   * @return The value of the {@code d} attribute
   */
  @Override
  public java.util.@SkipNulls Map<Integer, String> d() {
    return d;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link CollectionExample#a() a}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCollectionExample withA(String... elements) {
    java.util.@AllowNulls List<String> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableCollectionExample(newValue, this.b, this.c, this.d);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link CollectionExample#a() a}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of a elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCollectionExample withA(Iterable<String> elements) {
    if (this.a == elements) return this;
    java.util.@AllowNulls List<String> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableCollectionExample(newValue, this.b, this.c, this.d);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link CollectionExample#b() b}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCollectionExample withB(String... elements) {
    java.util.@SkipNulls List<String> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableCollectionExample(this.a, newValue, this.c, this.d);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link CollectionExample#b() b}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of b elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCollectionExample withB(Iterable<String> elements) {
    if (this.b == elements) return this;
    java.util.@SkipNulls List<String> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableCollectionExample(this.a, newValue, this.c, this.d);
  }

  /**
   * Copy the current immutable object by replacing the {@link CollectionExample#c() c} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the c map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCollectionExample withC(java.util.Map<Integer, ? extends String> entries) {
    if (this.c == entries) return this;
    java.util.@AllowNulls Map<Integer, String> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutableCollectionExample(this.a, this.b, newValue, this.d);
  }

  /**
   * Copy the current immutable object by replacing the {@link CollectionExample#d() d} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the d map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCollectionExample withD(java.util.Map<Integer, ? extends String> entries) {
    if (this.d == entries) return this;
    java.util.@SkipNulls Map<Integer, String> newValue = createUnmodifiableMap(true, false, entries);
    return new ImmutableCollectionExample(this.a, this.b, this.c, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCollectionExample} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCollectionExample
        && equalTo((ImmutableCollectionExample) another);
  }

  private boolean equalTo(ImmutableCollectionExample another) {
    return a.equals(another.a)
        && b.equals(another.b)
        && c.equals(another.c)
        && d.equals(another.d);
  }

  /**
   * Computes a hash code from attributes: {@code a}, {@code b}, {@code c}, {@code d}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + a.hashCode();
    h += (h << 5) + b.hashCode();
    h += (h << 5) + c.hashCode();
    h += (h << 5) + d.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CollectionExample} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "CollectionExample{"
        + "a=" + a
        + ", b=" + b
        + ", c=" + c
        + ", d=" + d
        + "}";
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
   * <pre>
   * ImmutableCollectionExample.builder()
   *    .addA|addAllA(String) // {@link CollectionExample#a() a} elements
   *    .addB|addAllB(String) // {@link CollectionExample#b() b} elements
   *    .putC|putAllC(int =&gt; String) // {@link CollectionExample#c() c} mappings
   *    .putD|putAllD(int =&gt; String) // {@link CollectionExample#d() d} mappings
   *    .build();
   * </pre>
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
  @Generated(from = "CollectionExample", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private java.util.List<String> a = new ArrayList<String>();
    private java.util.List<String> b = new ArrayList<String>();
    private java.util.Map<Integer, String> c = new LinkedHashMap<Integer, String>();
    private java.util.Map<Integer, String> d = new LinkedHashMap<Integer, String>();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code CollectionExample} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(CollectionExample instance) {
      Objects.requireNonNull(instance, "instance");
      addAllA(instance.a());
      addAllB(instance.b());
      putAllC(instance.c());
      putAllD(instance.d());
      return this;
    }

    /**
     * Adds one element to {@link CollectionExample#a() a} list.
     * @param element A a element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addA(String element) {
      this.a.add(Objects.requireNonNull(element, "a element"));
      return this;
    }

    /**
     * Adds elements to {@link CollectionExample#a() a} list.
     * @param elements An array of a elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addA(String... elements) {
      for (String element : elements) {
        this.a.add(Objects.requireNonNull(element, "a element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link CollectionExample#a() a} list.
     * @param elements An iterable of a elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder a(Iterable<String> elements) {
      this.a.clear();
      return addAllA(elements);
    }

    /**
     * Adds elements to {@link CollectionExample#a() a} list.
     * @param elements An iterable of a elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllA(Iterable<String> elements) {
      for (String element : elements) {
        this.a.add(Objects.requireNonNull(element, "a element"));
      }
      return this;
    }

    /**
     * Adds one element to {@link CollectionExample#b() b} list.
     * @param element A b element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addB(String element) {
      this.b.add(Objects.requireNonNull(element, "b element"));
      return this;
    }

    /**
     * Adds elements to {@link CollectionExample#b() b} list.
     * @param elements An array of b elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addB(String... elements) {
      for (String element : elements) {
        this.b.add(Objects.requireNonNull(element, "b element"));
      }
      return this;
    }


    /**
     * Sets or replaces all elements for {@link CollectionExample#b() b} list.
     * @param elements An iterable of b elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder b(Iterable<String> elements) {
      this.b.clear();
      return addAllB(elements);
    }

    /**
     * Adds elements to {@link CollectionExample#b() b} list.
     * @param elements An iterable of b elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllB(Iterable<String> elements) {
      for (String element : elements) {
        this.b.add(Objects.requireNonNull(element, "b element"));
      }
      return this;
    }

    /**
     * Put one entry to the {@link CollectionExample#c() c} map.
     * @param key The key in the c map
     * @param value The associated value in the c map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putC(int key, String value) {
      this.c.put(
          Objects.requireNonNull(key, "c key"),
          Objects.requireNonNull(value, "c value"));
      return this;
    }

    /**
     * Put one entry to the {@link CollectionExample#c() c} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putC(java.util.Map.Entry<Integer, ? extends String> entry) {
      Integer k = entry.getKey();
      String v = entry.getValue();
      this.c.put(
          Objects.requireNonNull(k, "c key"),
          Objects.requireNonNull(v, "c value"));
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link CollectionExample#c() c} map. Nulls are not permitted
     * @param entries The entries that will be added to the c map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder c(java.util.Map<Integer, ? extends String> entries) {
      this.c.clear();
      return putAllC(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link CollectionExample#c() c} map. Nulls are not permitted
     * @param entries The entries that will be added to the c map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putAllC(java.util.Map<Integer, ? extends String> entries) {
      for (java.util.Map.Entry<Integer, ? extends String> e : entries.entrySet()) {
        Integer k = e.getKey();
        String v = e.getValue();
        this.c.put(
            Objects.requireNonNull(k, "c key"),
            Objects.requireNonNull(v, "c value"));
      }
      return this;
    }

    /**
     * Put one entry to the {@link CollectionExample#d() d} map.
     * @param key The key in the d map
     * @param value The associated value in the d map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putD(int key, String value) {
      this.d.put(
          Objects.requireNonNull(key, "d key"),
          Objects.requireNonNull(value, "d value"));
      return this;
    }

    /**
     * Put one entry to the {@link CollectionExample#d() d} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putD(java.util.Map.Entry<Integer, ? extends String> entry) {
      Integer k = entry.getKey();
      String v = entry.getValue();
      this.d.put(
          Objects.requireNonNull(k, "d key"),
          Objects.requireNonNull(v, "d value"));
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link CollectionExample#d() d} map. Nulls are not permitted
     * @param entries The entries that will be added to the d map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder d(java.util.Map<Integer, ? extends String> entries) {
      this.d.clear();
      return putAllD(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link CollectionExample#d() d} map. Nulls are not permitted
     * @param entries The entries that will be added to the d map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putAllD(java.util.Map<Integer, ? extends String> entries) {
      for (java.util.Map.Entry<Integer, ? extends String> e : entries.entrySet()) {
        Integer k = e.getKey();
        String v = e.getValue();
        this.d.put(
            Objects.requireNonNull(k, "d key"),
            Objects.requireNonNull(v, "d value"));
      }
      return this;
    }

    /**
     * Builds a new {@link ImmutableCollectionExample ImmutableCollectionExample}.
     * @return An immutable instance of CollectionExample
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCollectionExample build() {
      return new ImmutableCollectionExample(
          createUnmodifiableList(true, a),
          createUnmodifiableList(true, b),
          createUnmodifiableMap(false, false, c),
          createUnmodifiableMap(false, false, d));
    }
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }

  private static <K, V> java.util.Map<K, V> createUnmodifiableMap(boolean checkNulls, boolean skipNulls, java.util.Map<? extends K, ? extends V> map) {
    switch (map.size()) {
    case 0: return Collections.emptyMap();
    case 1: {
      java.util.Map.Entry<? extends K, ? extends V> e = map.entrySet().iterator().next();
      K k = e.getKey();
      V v = e.getValue();
      if (checkNulls) {
        Objects.requireNonNull(k, "key");
        Objects.requireNonNull(v, "value");
      }
      if (skipNulls && (k == null || v == null)) {
        return Collections.emptyMap();
      }
      return Collections.singletonMap(k, v);
    }
    default: {
      java.util.Map<K, V> linkedMap = new LinkedHashMap<>(map.size());
      if (skipNulls || checkNulls) {
        for (java.util.Map.Entry<? extends K, ? extends V> e : map.entrySet()) {
          K k = e.getKey();
          V v = e.getValue();
          if (skipNulls) {
            if (k == null || v == null) continue;
          } else if (checkNulls) {
            Objects.requireNonNull(k, "key");
            Objects.requireNonNull(v, "value");
          }
          linkedMap.put(k, v);
        }
      } else {
        linkedMap.putAll(map);
      }
      return Collections.unmodifiableMap(linkedMap);
    }
    }
  }
}
