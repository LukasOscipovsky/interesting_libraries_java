package oscipovsky.lukas.immutables;

import org.immutables.value.Value;

import java.util.List;
import java.util.Random;

@Value.Immutable
public abstract class Order {

    public abstract List<Item> items();

    @Value.Derived // totalCount field is added to the class
    public int totalCount() {
        int count = 0;

        for (Item i : items())
            count += i.count();

        return count;
    }

    @Value.Lazy
    public int totalCost() {
        int cost = 0;

        for (Item i : items())
            cost += i.count() * i.price();

        return cost;
    }

    public static void main(String... args) {
        ImmutableOrder build = ImmutableOrder.builder().addItems(new Item()).addItems(new Item()).build();
        System.out.println(build.totalCount());
        System.out.println(build.totalCost());
    }
}


class Item {
    int count() {
        return new Random().nextInt(10);
    }

    double price() {
        return new Random().nextDouble();
    }
}
