import java.util.Scanner;




public class Program {

	public static void main(String[] args) {
		System.out.println("go");
		int number = 20;
		Scanner sc = new Scanner(System.in);
		int num ;
		System.out.println("enter the no");
		num = sc.nextInt();
		
		
		String binary  =  Integer.toBinaryString(num);
		System.out.println("Binary representation is " + binary);
		
		String octal = Integer.toOctalString(num);
		System.out.println("Octal Representation is " + octal);
		
		String hexal = Integer.toHexString(num);
		System.out.println("Hexal Representation is " + hexal);
        
	}

}
