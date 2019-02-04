package oscipovsky.lukas.immutables;

import org.immutables.value.Value;

@Value.Immutable(prehash = true) // means that there will be hashcode generated to the field
@Value.Style(visibility = Value.Style.ImplementationVisibility.PACKAGE)
public abstract class Book {

    @Value.Auxiliary // not included for equalt hashcode
    abstract String getAuthor();

    @Value.Default
    String getTitle() {
        return "OCA";
    }

    public static void main(String... args) {
        System.out.println(ImmutableBook.builder().author("John").build());
    }
}
