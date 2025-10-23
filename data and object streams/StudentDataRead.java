
import java.io.DataInputStream;
import java.io.FileInputStream;

public class StudentDataRead {
  public static void main(String[] args) {
      String fileName="students.dat";
      try(DataInputStream in=new DataInputStream(new FileInputStream(fileName))) {
        System.out.println("reading ");
        while (true) { 
            int mark=in.readInt();
            double average=in.readDouble();
            boolean pass=in.readBoolean();
            System.out.println("mark" + mark);
            System.out.println("average"+ average);
            System.out.println("passed"+ pass);
            System.out.println("--------------------------------");

        }
      } catch (Exception e) {
        e.printStackTrace();
      }
  }
}
