import java.util.Scanner;


class Person {
private int  id;
private String name;
private  String Dob;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    // public Person(int id,String name,String Dob){
    //   this.id=id;
    //   this.name=name;
    //   this.Dob=Dob;
    // }
    // void display(){
    //   System.out.println(id + name + Dob);
    // }

    


}

class Account extends Person {
  private  int accountNumber;
  private double balance;



  public void deposit(double amount) {
    if(amount>0){
    balance+=amount;
    System.out.println("your new deposit is " + balance);
  }else {
    System.out.println("invalid amount");
  }
  }

  

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw( double amount) {
      this.balance=balance;
      if(amount<=getBalance()) {
        setBalance(getBalance()-amount);
        System.out.println("you withdrawn"+ amount);
      }else {
        System.out.println("invalid amount");
      
    }

}
}


public class Exe {
  public static void main(String[] args) {
   Scanner sc=new  Scanner(System.in);
   Account acc=new Account();
  System.out.println("welcome to your account");
  System.out.println("your balance is " + acc.getBalance());
  System.out.println("Do you want 1. to deposit    2. to withdraw?");
  int choice=sc.nextInt();

  if(choice==1) {
    System.out.println("enter amount to be deposited");
    double amount= sc.nextDouble();
    acc.deposit(amount );
  } else if (choice==2) {
    System.out.println("enter amount to be withdrawn");
    double amount=sc.nextDouble();
    acc.withdraw(amount);
  } else {
    System.out.println("invalid choice");
  }
  System.out.println("new balance is " + acc.getBalance());
  
  }
}

