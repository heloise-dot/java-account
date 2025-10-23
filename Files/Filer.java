
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Filer {
 public static void main(String[] args) {
     String sourceFile= "sample.txt";
     String destination= "destination.txt";

     try (FileReader reader=new FileReader(sourceFile);
          FileWriter writer= new FileWriter(destination)) {

            int character;
            while ((character=reader.read())!=-1) {
              writer.write(character);
            }
            System.out.println("text file copied successfully!");
          }catch(IOException e) {
            e.printStackTrace();
          }

 } 
}
 