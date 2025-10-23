import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
public class IOStream2 {
  public static void main(String[] args) {
      File file=new File ("C:\\Users\\user\\OneDrive\\Documentos\\file.txt");
      try (PrintWriter writer=new PrintWriter(new FileWriter(file,true))) {
        writer.println("wake up");
       writer .println("still in java ..");
       System.out.println("success");
      } catch(Exception e) {
      System.out.println("error writing to file");
      }
  }
}