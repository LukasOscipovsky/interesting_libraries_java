package oscipovsky.lukas.lombok;

import lombok.experimental.UtilityClass;

@UtilityClass
public class UtilityClassExample {

    public static void doTest() {
        System.out.println("test");
    }

}

class UtilityTest {
    public static void main(String... args) {
       // new UtilityClassExample(); // private constuctor
    }
}
