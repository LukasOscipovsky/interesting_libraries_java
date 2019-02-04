package oscipovsky.lukas.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//@AllArgsConstructor(onConstructor=@__(@Inject))
@AllArgsConstructor
public class OnXExample {
    //@Getter(onMethod_={@Id, @Column(name="unique-id")}) //JDK8
    //@Setter(onParam_=@Max(10000)) //JDK8
    private long unid;
}
