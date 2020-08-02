import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//********************************************************************
//Garrett McCue 	
//
//8/2/20
//
//CPSC-501-Lab5Ex2
//**********************************************************************
public class Strings {
	//------------------------------------------------------------------
	// This takes in user strings and outputs them to userStrings.txt
	// In order to exit user must enter "DONE", which will not be 
	// included in the output file. 
	//------------------------------------------------------------------

	public static void main(String[] args) throws IOException {
		// initializes the file to be written to 
		String file = "userStrings.txt";
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		
		// user prompt
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter strings to be recorded: ");
		
		// infinite loop that is only broken if the input is 
		// "DONE". It breaks the loop and doesn't record
		// the last string to userStrings.txt
		while (true) {
			// gets next user string
			String input = scan.nextLine();
			// exits loop if input is "DONE"
			if (input.equals("DONE")) {
				break;
			}
			// outputs string to file
			outFile.print(input);
			outFile.println();

		}
		outFile.close();
		scan.close();
		System.out.println("Strings recorded in: " + file);

	}
}
