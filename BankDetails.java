package W3;
class BankAccount {
	String accountNumber;
	double balance;
	String HolderName;

 public BankAccount(String aNo, double bal, String Hname) {
     accountNumber = aNo;
     balance = bal;
     HolderName = Hname;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println(amount + " deposited successfully.");
 }

 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println(amount + " withdrawn successfully.");
     } else {
         System.out.println("Insufficient balance.");
     }
 }

 public void displayInfo() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Account Holder Name: " + HolderName);
     System.out.println("Balance: " + balance);
 }
}
public class BankDetails {
	public static void main(String[] args) {
        
        BankAccount myAccount = new BankAccount("123456789", 8000.0, "Siddarth Aryan");

       
        System.out.println("Initial Account Information:");
        myAccount.displayInfo();
        myAccount.deposit(1500.0);
        myAccount.withdraw(2000.0);
        System.out.println("\nModified Account Information:");
        myAccount.displayInfo();
    }
}

