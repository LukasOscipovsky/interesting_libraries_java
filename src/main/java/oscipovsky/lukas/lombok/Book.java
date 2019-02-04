package oscipovsky.lukas.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Book {

    @Setter(AccessLevel.PRIVATE)
    private String name;
    @Setter(value = AccessLevel.PUBLIC)
    private String author;
    @Getter(AccessLevel.NONE)
    private int isbn;

    public Book(String name, String author, int isbn) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }
}

class BookExample {
    public static void main(String... args) {
        //
        // Getter and Setters
        //

        Book b = new Book();

        b.setAuthor("Abcd");
        b.setIsbn(131131335);
        //b.setName("Cdef"); // will not compile, because setter is set to be private

        b.getAuthor();
        //b.getIsbn(); // not generated
        b.getName();
    }
}
