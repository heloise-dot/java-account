
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class EmployeeMain {
  public static void main(String[] args) {
      Employee e1= new Employee("heloise");
      try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("emp.ser"))) {
        oos.writeObject(e1);
        System.out.println("serialized");
      } catch(Exception e) {
        e.printStackTrace();
      }

      try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.ser"))) {
        Employee e2= (Employee) ois.readObject();
        System.out.println("Deserialized");
        e2.show();
      } catch(Exception e) {
        e.printStackTrace();
      }
  }

}
