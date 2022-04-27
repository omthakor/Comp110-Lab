// lab19.java

import java.util.*;
public class lab19 { // Driver program for Bank Account Lab

   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int input;
   int cID = -1; // Checking ID
   int sID = -1; // Saving ID
   int exit = 1;
   int tempID = 0; // temporary ID holder
   ArrayList<Checking> cList = new ArrayList<Checking>();
   ArrayList<Savings> sList = new ArrayList<Savings>();

   while(exit != 0) {
  	System.out.println("**********************************\n");
  	System.out.println("Select an option: ");
  	System.out.println("1) Open a checking account");
  	System.out.println("2) Checking deposit");
  	System.out.println("3) Checking withdraw");
  	System.out.println("4) Print checking account info");
  	System.out.println("5) Open a saving account");
  	System.out.println("6) Saving deposit");
  	System.out.println("7) Saving withdraw");
  	System.out.println("8) Print monthly interest");
  	System.out.println("9) Print saving account info");
  	System.out.println("10) Exit");
  	input = sc.nextInt();
  	System.out.println("\n**********************************");
   
   switch (input){
   
   case (1):
   cID++;
   cList.add(new Checking(cID, 0));
   System.out.print("Enter initial balance for account # " + cList.get(cID).getID() + ": ");
        	input = sc.nextInt();
        	cList.get(cID).setBalance((double)input);
   break;
   
   case (2):
  	System.out.print("Enter account number: ");
        	input = sc.nextInt();
        	tempID = 0;
        	if(input > cList.size()-1 || input < 0) {
           	System.out.println("Account " + input + " does not exist.");
        	}
        	else {
            	tempID = input;
            	System.out.print("Enter deposit amount: ");
            	input = sc.nextInt();
            	cList.get(tempID).deposit((double)input);
        	}
        	break;
   case (3):
 	System.out.print("Enter account number: ");
        	input = sc.nextInt();
        	tempID = 0;
        	if(input > cList.size()-1 || input < 0) {
           	System.out.println("Account " + input + " does not exist.");
        	}
        	else {
            	tempID = input;
            	System.out.print("Enter withdraw amount: ");
            	input = sc.nextInt();
            	cList.get(tempID).withdraw((double)input);
        	}
        	break;
   case (4):
  	System.out.println("Enter account number: ");
           	input = sc.nextInt();
           	if(input > cList.size()-1 || input < 0) {
              	System.out.println("Account " + input + " does not exist.");
           	}
           	else {
              	System.out.println(cList.get(input).toString());
           	}
   break;
   
   case (5):
   sID++;
   sList.add(new Savings(sID, 0.0, 0.0));
   System.out.print("Enter initial balance for account # " + sList.get(sID).getID() + ": ");
        	input = sc.nextInt();
        	sList.get(sID).setBalance((double)input);
   System.out.print("Enter annual interest rate for account # " + sList.get(sID).getID() + ": ");
        	input = sc.nextInt();
        	sList.get(sID).setAnnualInterestRate((double)input);
   break;

   case (6):
  	System.out.print("Enter account number: ");
        	input = sc.nextInt();
        	tempID = 0;
        	if(input > sList.size()-1 || input < 0) {
           	System.out.println("Account " + input + " does not exist.");
        	}
        	else {
            	tempID = input;
            	System.out.print("Enter deposit amount: ");
            	input = sc.nextInt();
            	sList.get(tempID).deposit((double)input);
        	}
        	break;
   case (7):
   	System.out.print("Enter account number: ");
        	input = sc.nextInt();
        	tempID = 0;
        	if(input > sList.size()-1 || input < 0) {
           	System.out.println("Account " + input + " does not exist.");
        	}
        	else {
            	tempID = input;
            	System.out.print("Enter withdraw amount: ");
            	input = sc.nextInt();
            	sList.get(tempID).withdraw((double)input);
        	}
        	break;
   case(8):
  	System.out.println("Enter account number: ");
           	input = sc.nextInt();
           	if(input > sList.size()-1 || input < 0) {
              	System.out.println("Account " + input + " does not exist.");
           	}
           	else {
              	//System.out.println("Account " + sList.get(sID).getID() + " earned $" + sList.get(sID).getBalance() * (sList.get(sID).getAnnualInterestRate()/100.0) / 12.0 + " interest.");
              	System.out.print("Account " + sList.get(sID).getID() + " earned $");
              	System.out.printf("%.2f", sList.get(sID).getBalance() * (sList.get(sID).getAnnualInterestRate()/100.0) / 12.0);
              	System.out.println(" interest.");
           	}
           	break;
   case(9):
	System.out.println("Enter account number: ");
           	input = sc.nextInt();
           	if(input > sList.size()-1 || input < 0) {
              	System.out.println("Account " + input + " does not exist.");
           	}
           	else {
              	System.out.println(sList.get(input).toString());
           	}
   break;
   
   case(10):
  	exit = 0;
  	System.out.print("Exiting Program...");
   break;
   
   default:
  	System.out.println("Invalid input");
   break;
   }
   }
   }
}
