import java.util.Scanner;

//********************************************************************
//Garrett McCue 	
//
//8/2/20
//
//CPSC-501-Lab5Ex4
//**********************************************************************
public class StringReversal {
	static String input;
	
	//-----------------------------------------------------------------
	// This takes in a string from the user and returns the string
	// in reverse order using a recursion method
	//-----------------------------------------------------------------

	public static void main(String[] args) {

		System.out.print("Enter a string: ");
		Scanner scan = new Scanner(System.in);

		input = scan.nextLine();

		System.out.println("\nString reversed: " + reverseString(input));

		scan.close();

	}

	private static String reverseString(String str) {
		if (str.length() <= 1) {
			return str;
		}
		
		// Returns the last character to the front and calls reverseString() until the string is reversed.
		// Example: dog --> g+do --> g+o+d --> god(output)
		return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
	}

}
