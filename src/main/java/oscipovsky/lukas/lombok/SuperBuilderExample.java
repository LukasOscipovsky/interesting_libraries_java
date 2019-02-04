package oscipovsky.lukas.lombok;

import lombok.experimental.SuperBuilder;

//@SuperBuilder
public class SuperBuilderExample extends SuperClass {
    private String color;

    public static void main(String args) {
       // SuperBuilderExample does not work
    }
}

class SuperClass {
    private String name;
}