import java.io.BufferedReader;
import java.io.FileReader;

public  class CountLine {
  public static void main(String[] args) {
      String fileName="example.txt";
      int lineCount=0;
      try(BufferedReader reader=new BufferedReader(new FileReader(fileName))) {
      while(reader.readLine()!=null){
          lineCount++;
        }
        System.out.println("number of lines is" +  lineCount);
          
      } catch (Exception e) {
        System.out.println("an error encountered");
      }
  }
}
