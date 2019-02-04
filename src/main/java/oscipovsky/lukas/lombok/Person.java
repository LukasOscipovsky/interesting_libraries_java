package oscipovsky.lukas.lombok;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;
}

enum Gender {
    MALE, FEMALE;
}

class PersonExample {
    public static void main(String... args) {
        //
        // Builder
        //

        Person lukas = new Person.PersonBuilder().firstName("Lukas").lastName("Oscipovsky").age(29).gender(Gender.MALE).build();
    }
}
