import java.util.Scanner;

public class Ddc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter Total miles driven per day : ");
		double milesPerDay = sc.nextDouble();
		
		System.out.print("Enter Cost per gallon of gasoline : ");
		double costPerGallon = sc.nextDouble();
		
		System.out.print("Enter Average miles per gallon : ");
		double avgMiles = sc.nextDouble();
		
		System.out.print("Parking fees per day");
		double parkFees = sc.nextDouble();
		
		System.out.print("Tolls per day");
		double tollFee = sc.nextDouble();
		
		double totalDrivingCost = (milesPerDay*costPerGallon)/avgMiles +parkFees + tollFee;
		System.out.println("Daily Driving Cost = "+totalDrivingCost);
	}

}
