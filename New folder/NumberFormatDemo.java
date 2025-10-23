import java.text.NumberFormat;
import java.util.Locale;

class NumberFormatDemo {
    public static void main(String[] args) {
        double num = 50000.456;

        NumberFormat usFormat = NumberFormat.getInstance(Locale.US);       // <- use NumberFormat here
        NumberFormat frFormat = NumberFormat.getInstance(Locale.FRANCE);    // <- use NumberFormat here

        System.out.println("FRENCH FORMAT: " + frFormat.format(num));
        System.out.println("ENGLISH FORMAT: " + usFormat.format(num));
    }
}
