// Savings.java
import java.util.*;

public class Savings extends Account {
	protected double annualInterestRate;
	public Savings() {
    	annualInterestRate = 0;
	}
	public Savings(int id, double balance, double rate) {
    	super(id, balance);   	 
	}
	public double getAnnualInterestRate() {
    	return annualInterestRate;
	}
	public void setAnnualInterestRate(double rate) {
    	this.annualInterestRate = rate;
	}
	public double getMonthlyInterest() {
    	return (balance * annualInterestRate/1200);
	}
	public void withdraw(double amount) {
 	if(amount > this.balance) {
     	System.out.println("Error, withdraw amount larger than account balance.");
  	}
  	else {
    	this.balance = balance - amount;
    	}
	}
	public String toString() {
    	return "Savings" + "\nAccount id: " + id + "\nAccount Opened: " + super.getDateOpened() +
            	"\nBalance: " + balance + "\nInterestRate: " + annualInterestRate;
	}
}
