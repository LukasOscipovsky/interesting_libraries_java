package oscipovsky.lukas.lombok;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(doNotUseGetters = true, exclude = "color", callSuper = false)
@EqualsAndHashCode(doNotUseGetters = true, exclude = "color")
public class Car {
    private String name;
    private String color;
    private String brand;
}

class CarExample {
    public static void main(String... args) {
        //
        // Eqauls, hashCode, ToString
        //

        Car c = new Car("Ceed", "Brown", "Kia");
        System.out.println(c.equals(new Car("Ceed", "Brown", "Kia")));
        System.out.println(c);
    }
}
