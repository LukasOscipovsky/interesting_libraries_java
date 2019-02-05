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
 * Immutable implementation of {@link Book}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBook.builder()}.
 */
@Generated(from = "Book", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@Immutable
@CheckReturnValue
final class ImmutableBook extends Book {
  private final String author;
  private final String title;
  private transient final int hashCode;

  private ImmutableBook(ImmutableBook.Builder builder) {
    this.author = builder.author;
    this.title = builder.title != null
        ? builder.title
        : Objects.requireNonNull(super.getTitle(), "title");
    this.hashCode = computeHashCode();
  }

  private ImmutableBook(String author, String title) {
    this.author = author;
    this.title = title;
    this.hashCode = computeHashCode();
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @Override
  String getAuthor() {
    return author;
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @Override
  String getTitle() {
    return title;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Book#getAuthor() author} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for author
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBook withAuthor(String value) {
    String newValue = Objects.requireNonNull(value, "author");
    if (this.author.equals(newValue)) return this;
    return new ImmutableBook(newValue, this.title);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Book#getTitle() title} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for title
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBook withTitle(String value) {
    String newValue = Objects.requireNonNull(value, "title");
    if (this.title.equals(newValue)) return this;
    return new ImmutableBook(this.author, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBook} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBook
        && equalTo((ImmutableBook) another);
  }

  private boolean equalTo(ImmutableBook another) {
    if (hashCode != another.hashCode) return false;
    return title.equals(another.title);
  }

  /**
   * Returns a precomputed-on-construction hash code from attributes: {@code title}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    return hashCode;
  }

  private int computeHashCode() {
    @Var int h = 5381;
    h += (h << 5) + title.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Book} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Book")
        .omitNullValues()
        .add("title", title)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Book} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Book instance
   */
  public static ImmutableBook copyOf(Book instance) {
    if (instance instanceof ImmutableBook) {
      return (ImmutableBook) instance;
    }
    return ImmutableBook.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableBook ImmutableBook}.
   * <pre>
   * ImmutableBook.builder()
   *    .author(String) // required {@link Book#getAuthor() author}
   *    .title(String) // optional {@link Book#getTitle() title}
   *    .build();
   * </pre>
   * @return A new ImmutableBook builder
   */
  public static ImmutableBook.Builder builder() {
    return new ImmutableBook.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableBook ImmutableBook}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Book", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_AUTHOR = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String author;
    private @Nullable String title;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Book} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Book instance) {
      Objects.requireNonNull(instance, "instance");
      author(instance.getAuthor());
      title(instance.getTitle());
      return this;
    }

    /**
     * Initializes the value for the {@link Book#getAuthor() author} attribute.
     * @param author The value for author 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder author(String author) {
      this.author = Objects.requireNonNull(author, "author");
      initBits &= ~INIT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the value for the {@link Book#getTitle() title} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link Book#getTitle() title}.</em>
     * @param title The value for title 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder title(String title) {
      this.title = Objects.requireNonNull(title, "title");
      return this;
    }

    /**
     * Builds a new {@link ImmutableBook ImmutableBook}.
     * @return An immutable instance of Book
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableBook build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableBook(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_AUTHOR) != 0) attributes.add("author");
      return "Cannot build Book, some of required attributes are not set " + attributes;
    }
  }
}
