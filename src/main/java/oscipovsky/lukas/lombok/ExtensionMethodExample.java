package oscipovsky.lukas.lombok;

import lombok.experimental.ExtensionMethod;

@ExtensionMethod(Extensions.class)
public class ExtensionMethodExample {

    public void test() {
    }

    public static void main(String... args) {
        ExtensionMethodExample extensionMethodExample = new ExtensionMethodExample();
        extensionMethodExample.test();
    }
}

class Extensions {
    public static <T> T or(T obj, T ifNull) { // only public static
        return obj == null ? ifNull : obj;
    }

    public static String toConcat(String concat) { // only public static
        return concat + "test";
    }
}
