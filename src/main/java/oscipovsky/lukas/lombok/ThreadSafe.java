package oscipovsky.lukas.lombok;

import lombok.AllArgsConstructor;
import lombok.Synchronized;

import java.util.stream.IntStream;

@AllArgsConstructor
public class ThreadSafe implements Runnable {

    private Integer count;

    @Synchronized
    public void run() {
        IntStream.range(0,100).forEach(i -> {count++; System.out.println(count);});
    }

    public static void main(String... args) {
        int i = 0;
        new Thread(new ThreadSafe(i)).start();
        new Thread(new ThreadSafe(i)).start();
    }
}
