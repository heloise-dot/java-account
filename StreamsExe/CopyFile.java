
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class CopyFile {
  public static void main(String[] args) {
      String source="example.txt";
      String destination="destination.txt";
      try(BufferedReader reader=new BufferedReader(new FileReader(source));
          BufferedWriter writer=new BufferedWriter(new FileWriter(destination))) {
            String line;
            while((line=reader.readLine())!=null){
              writer.write(line);
              writer.newLine();
            }
            System.out.println("file printed successfully");
          } catch (Exception e) {
            System.out.println("an error encountered");
          }
  }
}
