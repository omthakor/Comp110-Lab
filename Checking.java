// Checking.java
public class Checking extends Account {

    protected double overdraftlimit;
    
    public Checking() {
       super();
       this.overdraftlimit = 500.0;
    }
    
    public Checking(int id, double balance) {
       this.id = id;
       this.balance = balance;
       this.overdraftlimit = 500.0;
    }
    
    public void withdraw(double amount) {
       if(amount > this.balance) {
          System.out.println("Error, withdraw amount larger than account balance.");
       }
       else if(this.overdraftlimit > amount) {
          this.balance = balance - amount;
       }
       else {
          System.out.println("Overdraft limit reached.");
       }
    }
    
    public String toString() {
       return "Checkings\nAccount id: " + super.getID() + "\nAccount opened: " + super.getDateOpened() + "\nBalance: " + super.getBalance();
    }
 
 }
 