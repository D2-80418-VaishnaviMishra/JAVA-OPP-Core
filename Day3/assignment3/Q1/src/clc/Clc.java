package clc;

import java.util.Scanner;

public class Clc {
		
	int accno;
	int pendBal;
	int totalCreditUsed;
	int totalCreditApplied;
	int allowedLimit;
	
	public Clc(){
		
	}
	
	public Clc(int accno, int pendBal, int totalCreditUsed, int totalCreditApplied, int allowedLimit) {
		this.accno = accno;
		this.pendBal = pendBal;
		this.totalCreditUsed = totalCreditUsed;
		this.totalCreditApplied = totalCreditApplied;
		this.allowedLimit = allowedLimit;
	}
	
	public void acceptCustomer() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the account number : ");
		this.accno = sc.nextInt();
		System.out.print("Enter the pending balance : ");
		this.pendBal = sc.nextInt();
		System.out.print("Enter the total items purchased : ");
		this.totalCreditUsed = sc.nextInt();
		System.out.print("Enter the credit applied : ");
		this.totalCreditApplied = sc.nextInt();
		System.out.print("Enter the Credit limit : ");
		this.allowedLimit = sc.nextInt();
		
	}

	public void calculate() {
		 int newBalance = pendBal + totalCreditUsed - totalCreditApplied;
		 if (newBalance<this.allowedLimit) {
			 System.out.println("Available Credit Limit = "+newBalance);
		 } else {
			 System.out.println("Credit Limit Exceeded");
		 }
	}
	
	
	

}
