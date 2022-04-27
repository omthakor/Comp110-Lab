// Account.java
public class Account{
    protected int id = 0;
    protected double balance = 0.0;
    protected java.util.Date dateCreated;
    
 
 public Account(){
    dateCreated = new java.util.Date();
    }
 public Account(int id, double balance){
    this();
    this.id = id;
    this.balance = balance;
    }
 public int getID(){
    return this.id;
    }
 public double getBalance(){
    return this.balance;
    }
 public void setID(int id){
    this.id = id;
    }
 public void setBalance(double balance){
    this.balance = balance;
    }
 public String getDateOpened(){
    return this.dateCreated.toString();
    }
 public void withdraw(double amount){
  if(amount > this.balance) {
          System.out.println("Error, withdraw amount larger than account balance.");
       }
    else {
    this.balance = balance - amount;
    }
    }
 public void deposit(double amount){
    this.balance = balance + amount;
    }
    
 public String toString(){
 return "Account id: " + id + "\nAccount opened: " + dateCreated + "\nBalance: " + balance;
 }
    
 }
 