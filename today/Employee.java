import java.io.Serializable;

public class Employee implements Serializable {
  String name;
  public Employee(String name) {
    this.name=name;
  }
  void show(){
    System.out.println("name" + name);
  }
}