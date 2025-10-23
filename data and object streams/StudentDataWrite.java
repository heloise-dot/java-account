
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class StudentDataWrite {
  public static void main(String[] args) {
      String fileName="students.dat";
       try(DataOutputStream out=new DataOutputStream(new FileOutputStream(fileName))) {
        out.writeInt(78);
        out.writeDouble(78.5);
        out.writeBoolean(true);


        out.writeInt(55);    
        out.writeDouble(55.2);
        out.writeBoolean(false);

        out.writeInt(90);     
        out.writeDouble(90.0);
        out.writeBoolean(true);
       } catch (Exception e) {
        e.printStackTrace();
       }
  }
}
