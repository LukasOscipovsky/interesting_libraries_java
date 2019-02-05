package oscipovsky.lukas.immutables;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.Var;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link TupleExample}.
 * <p>
 * Use the static factory method to create immutable instances:
 * {@code TupleExampleTuple.of()}.
 */
@Generated(from = "TupleExample", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Immutable
@CheckReturnValue
public final class TupleExampleTuple implements TupleExample {
  private final int a;
  private final int b;

  private TupleExampleTuple(int a, int b) {
    this.a = a;
    this.b = b;
  }

  /**
   * @return The value of the {@code a} attribute
   */
  @Override
  public int a() {
    return a;
  }

  /**
   * @return The value of the {@code b} attribute
   */
  @Override
  public int b() {
    return b;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TupleExample#a() a} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for a
   * @return A modified copy of the {@code this} object
   */
  public final TupleExampleTuple withA(int value) {
    if (this.a == value) return this;
    return new TupleExampleTuple(value, this.b);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TupleExample#b() b} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for b
   * @return A modified copy of the {@code this} object
   */
  public final TupleExampleTuple withB(int value) {
    if (this.b == value) return this;
    return new TupleExampleTuple(this.a, value);
  }

  /**
   * This instance is equal to all instances of {@code TupleExampleTuple} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof TupleExampleTuple
        && equalTo((TupleExampleTuple) another);
  }

  private boolean equalTo(TupleExampleTuple another) {
    return a == another.a
        && b == another.b;
  }

  /**
   * Computes a hash code from attributes: {@code a}, {@code b}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + a;
    h += (h << 5) + b;
    return h;
  }

  /**
   * Prints the immutable value {@code TupleExample} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TupleExample")
        .omitNullValues()
        .add("a", a)
        .add("b", b)
        .toString();
  }

  /**
   * Construct a new immutable {@code TupleExample} instance.
   * @param a The value for the {@code a} attribute
   * @param b The value for the {@code b} attribute
   * @return An immutable TupleExample instance
   */
  public static TupleExampleTuple of(int a, int b) {
    return new TupleExampleTuple(a, b);
  }

  /**
   * Creates an immutable copy of a {@link TupleExample} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TupleExample instance
   */
  public static TupleExampleTuple copyOf(TupleExample instance) {
    if (instance instanceof TupleExampleTuple) {
      return (TupleExampleTuple) instance;
    }
    return TupleExampleTuple.of(instance.a(), instance.b());
  }
}
