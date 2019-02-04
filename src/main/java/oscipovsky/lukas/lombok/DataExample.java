package oscipovsky.lukas.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Delegate;

@ToString
public class DataExample implements Game {

    @Delegate(types = {Game.class})
    private final ActionGame game = new ActionGame();

    public static void main(String... args) {
        DataExample data = new DataExample();
        data.setName("GTA5");
        data.setYear(2013);
        data.setPrice(49.99);
        System.out.println(data);
    }

}

interface Game {

    String getName();
    void setName(String name);
    Integer getYear();
    void setYear(Integer year);
    Double getPrice();
    void setPrice(Double price);


    String getGenre();
}


@Data
class ActionGame implements Game {

    private String name;
    private String genre;
    private Integer year;
    private Double price;

    public String getGenre() {
        return "Action";
    }
}