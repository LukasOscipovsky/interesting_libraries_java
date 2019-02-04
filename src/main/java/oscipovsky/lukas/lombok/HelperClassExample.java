package oscipovsky.lukas.lombok;

import lombok.experimental.Helper;

public class HelperClassExample {

    int someMethod(int args1) {
        int localVar = 5;

        //@Helper
        class Helpers {
            int helperMethod(int arg) {
                return arg + localVar;
            }
        }
        //Helpers h = new Helpers();

        //return helperMethod(10);
        return 1;
    }
}
