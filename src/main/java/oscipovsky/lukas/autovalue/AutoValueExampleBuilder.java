package oscipovsky.lukas.autovalue;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class AutoValueExampleBuilder {
    public abstract String getCurrency();
    public abstract long getAmount();

    public static AutoValueExampleBuilder create(String newCurrency, long newAmount) {
        return builder()
                .setCurrency(newCurrency)
                .setAmount(newAmount)
                .build();
    }

    public static Builder builder() {
        return new AutoValue_AutoValueExampleBuilder.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setCurrency(String newCurrency);

        public abstract Builder setAmount(long newAmount);

        public abstract AutoValueExampleBuilder build();
    }

    public static void main(String... args) {
        AutoValueExampleBuilder eur = AutoValueExampleBuilder.builder().setAmount(1).setCurrency("EUR").build();
        System.out.println(eur.getAmount() + " " + eur.getCurrency());
    }
}
