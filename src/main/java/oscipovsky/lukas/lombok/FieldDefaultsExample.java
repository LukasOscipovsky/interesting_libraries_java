package oscipovsky.lukas.lombok;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;
import lombok.experimental.PackagePrivate;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class FieldDefaultsExample {
    int a;
    @PackagePrivate int b;
    @NonFinal int c;

    public static void main(String... args) {
        new FieldDefaultsExample(1,2,3);
    }
}
