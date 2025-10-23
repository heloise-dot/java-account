
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FrenchToUs {
  public static void main (String[] args) throws ParseException {
    String frenchNumber="3,14";
    NumberFormat frenchFormat= NumberFormat.getInstance(Locale.FRANCE);
    Number number= frenchFormat.parse(frenchNumber);
    NumberFormat usFormat=NumberFormat.getInstance(Locale.US);
    System.out.println("french format" + frenchNumber);
    System.out.println("Us format" + usFormat.format(number));
  }
}