package oscipovsky.lukas.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true, chain = true, prefix = "ae")
public class AccesorsExample {

    private String aeName;
    private String aeColor;

    public static void main(String... args) {
        AccesorsExample ae = new AccesorsExample();
        ae.name("name").color("color");
        System.out.println(ae.name() + " " + ae.color());
    }
}
