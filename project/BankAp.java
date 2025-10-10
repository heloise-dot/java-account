
class AccountOperationException extends Exception {
    public AccountOperationException(String message) {
        super(message);
    }
}




abstract class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public Account (String accountNumber, String accountHolder, double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws AccountOperationException{
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited" + amount);
        }else{
        throw new AccountOperationException("invalid deposit amount"+ amount);
        }
    }

    public abstract void withdraw(double amount) throws AccountOperationException;

}




class SavingsAccount extends  Account{

    private double interestRate;

    public  SavingsAccount(String accountNumber,String accountHolder,double balance,double interestRate) {
        super(accountNumber,accountHolder,balance);
        this.interestRate=interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    
    public void withdraw (double amount) throws AccountOperationException {
        if(amount > 0 && amount <= getBalance()) {
            setBalance(getBalance()-amount);
            System.out.println("withdrawn:" + amount);
        }else {
            throw new IllegalArgumentException ("interest rate must be non-negative");
        }

    }
    public void addInterest() {
        double interest= getBalance()*interestRate/100;
        setBalance(getBalance()+interest);
        System.out.println("Interest added:" + interest);
    }

}


class checkingAccount extends Account {
   private double overdraftLimit;

   public checkingAccount(String accountNumber, String accountHolder,double overdraftLimit,double balance){
    super(accountNumber, accountHolder, balance);
    this.overdraftLimit=overdraftLimit;
   }

   public double getOverdraftLimit(){
    return overdraftLimit;
}
public void withdraw(double amount) throws AccountOperationException{
        if (amount > 0 && amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn: " + amount + " from Checking Account");
        } else {
            throw new AccountOperationException("insufficient balance. current balance:" +getBalance());
        }
}
}





public class BankAp{
    public static void main(String[] args){
  SavingsAccount savings=new SavingsAccount("1011", "Heloise"
  , 5000, 3.5);
  try {
    savings.deposit(1000);
    savings.withdraw(200);
    savings.addInterest();
    
  } catch (AccountOperationException e) {
System.out.println("Error"+e.getMessage());
  }
   checkingAccount checking = new checkingAccount("C2001", "John", 2000, 500);
    
    
    
    }
}
