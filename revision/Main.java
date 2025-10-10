class Library {
  String libraryName="city library";

  class Book {
    String bookName;

        public Book(String name) {
          bookName=name;

        }
        void showBook(){
          System.out.println(bookName + "is in" + libraryName );
        }
    
  }
}
public class Main {
  public static void main(String[] args) {
      Library library=new Library();
      Library.Book book= library.new Book("JAVA");
  }
}
