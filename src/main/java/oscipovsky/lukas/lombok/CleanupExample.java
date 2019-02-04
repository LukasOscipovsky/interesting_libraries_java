package oscipovsky.lukas.lombok;

import lombok.Cleanup;

import java.io.IOException;
import java.io.InputStream;

public class CleanupExample {

    public static void main(String... args) throws IOException {
        //
        // Cleanup
        //

        // will call close method automatically without implementing any interface
        @Cleanup InputStream is = new CleanupExample().getClass().getResourceAsStream("res.txt");
    }
}
