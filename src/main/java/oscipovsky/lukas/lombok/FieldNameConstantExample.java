package oscipovsky.lukas.lombok;

import lombok.AccessLevel;
import lombok.experimental.FieldNameConstants;

@FieldNameConstants(level = AccessLevel.PUBLIC)
public class FieldNameConstantExample {
// does not work
//    private final String a;
//    private final int b;
//    private final String c;
}
