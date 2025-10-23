
import java.util.Scanner;

public class Delimiter {
  public static void main(String[] args) {
      String data="Honorine turamuha bonbon 4";
      
    Scanner c= new Scanner (data);
   
    String token1=c.next();
    String token2=c.next();
    String token3=c.next();
    int token4=c.nextInt();

    System.out.println("name:" +token1+ "bonbon :"+token4);
    c.close();

    String data2="17/10/2025";
    Scanner sc= new Scanner(data2);
    sc.useDelimiter("/");
    int day= sc.nextInt();
    int month=sc.nextInt();
    int year=sc.nextInt();
    int combined= day+month+year;
    System.out.println("sum"+combined);
    
  }
}


