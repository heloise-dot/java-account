
import java.text.NumberFormat;
import java.util.Locale;

public class LocaleCurrencyDemo {
  public static void main(String[] args) {
      double amount=1999.9;

      NumberFormat usCurrency= NumberFormat.getCurrencyInstance(Locale.US);
      NumberFormat franceCurrency=NumberFormat.getCurrencyInstance(Locale.FRANCE);
      NumberFormat japanCurrency=NumberFormat.getCurrencyInstance(Locale.JAPAN);
      System.out.println("US" + usCurrency.format(amount));
      System.out.println("FRANCE" + franceCurrency.format(amount));
      System.out.println("JAPAN" + japanCurrency.format(amount));

  }
}
