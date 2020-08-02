import java.util.Scanner;

//********************************************************************
//Garrett McCue 	
//
//8/2/20
//
//CPSC-501-Lab5Ex3
//**********************************************************************
public class DivisorCalc {
	static int num1, num2;
	//-------------------------------------------------------------
	// returns the greatest common divisor between the two integers
	// by implementing a recursive method.
	//-------------------------------------------------------------
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter numbers");
		System.out.print("\nnumber 1: ");
		num1 = scan.nextInt();

		System.out.print("number 2: ");
		num2 = scan.nextInt();

		scan.close();

		System.out.println("\nGCD of " + num1 + " & " + num2 + " is: " + gcd(num1, num2));

	}

	// finds the greatest common denominator between the two numbers
	public static int gcd(int num1, int num2) {
		if (num1 % num2 == 0) {
			return num2;
		}
		// recursion...iterates back to the top of gcd() until
		// num1%num2==0
		return gcd(num2, num1 % num2);

	}

}
