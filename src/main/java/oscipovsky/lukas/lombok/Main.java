package oscipovsky.lukas.lombok;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
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

        //
        // RequiredArgsConstructors and Fluent
        //

        Title t = new Title("name").author("author");
        t.author();
        t.name();

        //
        // Eqauls, hashCode, ToString
        //

        Car c = new Car("Ceed", "Brown", "Kia");
        System.out.println(c.equals(new Car("Ceed", "Brown", "Kia")));
        System.out.println(c);
        
        //
        // Builder
        //

        Person lukas = new Person.PersonBuilder().firstName("Lukas").lastName("Oscipovsky").age(29).gender(Gender.MALE).build();

        //
        // sneakyThrows
        //

        sneakyThrows();

        //
        // Cleanup
        //

        // will call close method automatically without implementing any interface
        @Cleanup InputStream is = lukas.getClass().getResourceAsStream("res.txt");

        //
        // Logging
        //

        LogExample.testLog();

    }

    @SneakyThrows
    static void sneakyThrows() {
        throw new LukasException();

        //} catch (LukasException ex) {
        //    throw new RuntimeException(ex);
        //}
    }

    static class LukasException extends Exception {

    }
}
