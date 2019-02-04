package oscipovsky.lukas.lombok;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class LogExample {

    public static void testLog() {
        log.debug("Test");
    }

    public static void main(String... args) {
        //
        // Logging
        //

        LogExample.testLog();
    }
}
