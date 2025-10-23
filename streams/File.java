
import java.io.FileOutputStream;
import java.io.IOException;


public class File {
  public static void main(String[] args) {
    String text="hello world";
      try(FileOutputStream output=new FileOutputStream("text.txt")) {
        output.write(text.getBytes());
        System.out.println("successfully wrote to the file.");
      
      } catch(IOException e) {
      System.out.println("error in writing file");
      e.printStackTrace();
      }
  }
}