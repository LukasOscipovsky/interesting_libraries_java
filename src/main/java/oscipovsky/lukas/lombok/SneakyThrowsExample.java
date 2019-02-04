package oscipovsky.lukas.lombok;

import lombok.SneakyThrows;

public class SneakyThrowsExample {
    public static void main(String... args) {
        sneakyThrows();
    }

    @SneakyThrows
    static void sneakyThrows() {
        throw new SneakyThrowsExample.LukasException();

        //} catch (LukasException ex) {
        //    throw new RuntimeException(ex);
        //}
    }

    static class LukasException extends Exception {

    }
}
