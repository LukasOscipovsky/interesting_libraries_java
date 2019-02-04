package oscipovsky.lukas.lombok;

import lombok.AccessLevel;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Wither;

@Wither
@ToString
public class WitherExample {

    private final String name;
    @Wither(value = AccessLevel.PROTECTED) private final String color;

    public WitherExample(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static void main(String... args) {
        WitherExample witherExample = new WitherExample("name", "color");
        witherExample = witherExample.withName("name2").withColor("color2");
        System.out.println(witherExample);
    }
}
