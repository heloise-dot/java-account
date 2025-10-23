
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class BooksMain {
  public static void main(String[] args) {
      Books bk=new Books("River Between","chinua achebe",9.99);
      try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("book.ser"))) {
        oos.writeObject(bk);
        System.out.println("serialized");

      } catch (Exception e) {
        e.printStackTrace();

      }

      try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("book.ser"))) {
        Books bk1=(Books) ois.readObject();
        System.out.println("title" + bk1.title);
        System.out.println("author"+ bk1.author);
        System.out.println("price"+bk1.price);
      } catch(Exception e) {
        e.printStackTrace();
      }
  }
}
