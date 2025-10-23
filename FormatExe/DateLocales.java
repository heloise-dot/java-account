
import java.util.Date;
import java.util.Locale;

public class DateLocales {
  public static void main(String[] args) {
      Date now=new Date();

      System.out.printf(Locale.US,"US: %tA ,%tB,%td,%tY %tT\n",now,now,now,now );
      System.out.printf(Locale.FRANCE,"US: %tA ,%tB,%td,%tY %tT\n",now,now,now,now );
      System.out.printf(Locale.JAPAN,"US: %tA ,%tB,%td,%tY %tT\n",now,now,now,now );
  }
}
