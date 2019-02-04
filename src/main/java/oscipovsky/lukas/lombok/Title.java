package oscipovsky.lukas.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@RequiredArgsConstructor(access = AccessLevel.PUBLIC, onConstructor = {})
//@RequiredArgsConstructor(staticName = "of",access = AccessLevel.PUBLIC, onConstructor = {})
@Accessors(fluent = true)
@Getter
@Setter
public class Title {

    private final @NonNull String name;
    private String author; // will not be includede in constrcutor, not final or notnull
}

class TitleExample {
    public static void main(String... args) {
        //
        // RequiredArgsConstructors and Fluent
        //

        Title t = new Title("name").author("author");
        t.author();
        t.name();
    }
}
