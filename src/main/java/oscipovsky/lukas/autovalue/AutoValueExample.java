package oscipovsky.lukas.autovalue;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class AutoValueExample {
    public abstract String getCurrency();
    public abstract long getAmount();

    public static AutoValueExample create(String newCurrency, long newAmount) {
        return new AutoValue_AutoValueExample(newCurrency, newAmount);
    }

    public static void main(String... args) {
        AutoValueExample eur = AutoValueExample.create("EUR", 1);
        System.out.println(eur);
    }
}
