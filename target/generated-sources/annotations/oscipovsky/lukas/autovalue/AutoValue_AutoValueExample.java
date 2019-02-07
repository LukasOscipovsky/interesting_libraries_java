
package oscipovsky.lukas.autovalue;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AutoValueExample extends AutoValueExample {

  private final String currency;
  private final long amount;

  AutoValue_AutoValueExample(
      String currency,
      long amount) {
    if (currency == null) {
      throw new NullPointerException("Null currency");
    }
    this.currency = currency;
    this.amount = amount;
  }

  @Override
  public String getCurrency() {
    return currency;
  }

  @Override
  public long getAmount() {
    return amount;
  }

  @Override
  public String toString() {
    return "AutoValueExample{"
        + "currency=" + currency + ", "
        + "amount=" + amount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AutoValueExample) {
      AutoValueExample that = (AutoValueExample) o;
      return (this.currency.equals(that.getCurrency()))
           && (this.amount == that.getAmount());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.currency.hashCode();
    h *= 1000003;
    h ^= (this.amount >>> 32) ^ this.amount;
    return h;
  }

}
