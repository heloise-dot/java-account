
import java.io.BufferedReader;
import java.io.FileReader;



public class UpperCase {
  public static void main(String[] args) {
    String fileName="example1.txt";
    try(BufferedReader reader=new BufferedReader(new FileReader(fileName))) {
      String line;
      while( (line=reader.readLine())!=null){
        System.out.println("the line is" + line.toUpperCase());
      }
    } catch(Exception e) {
      System.out.println("an error encountered.");
    }

  }
}
