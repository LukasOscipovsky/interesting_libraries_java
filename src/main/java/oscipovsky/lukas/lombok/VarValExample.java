package oscipovsky.lukas.lombok;

import lombok.val;
import lombok.var;

public class VarValExample {

    public static void main(String... args) {
        val a = "TestA";
        var b = "TestB";

        // a = "TestC";// not possible immutable
        b = "TestD";

    }
}
