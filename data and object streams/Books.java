import java.io.Serializable;

public class Books implements Serializable {

    String title;
    String author;
    double price;
    public Books( String title,String author,double price) {
      this.title=title;
      this.author=author;
      this.price=price;
    }
  
}