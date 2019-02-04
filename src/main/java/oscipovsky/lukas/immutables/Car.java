package oscipovsky.lukas.immutables;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(of = "create", allParameters = true) // renames of to create
public abstract class Car {

    @Value.Parameter
    abstract String getName();
    @Value.Parameter
    abstract String getBrand();
    abstract String getColor();

    public static void main(String... args) {
        ImmutableCar car= ImmutableCar.create("Ceed", "Kia", "Brown");
        System.out.println(car);
    }
}
