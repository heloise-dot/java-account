import java.util.Locale;

public class NumFormat {
  public static void main(String[] args) {
      double number= 1200000.75;
      System.out.printf(Locale.US,"US Format: %, .2f",number);
      System.out.printf(Locale.FRANCE,"France format: %, .2f\n",number);
  }
  
}
