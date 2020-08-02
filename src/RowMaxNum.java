
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//********************************************************************
//Garrett McCue 	
//
//8/1/20
//
//CPSC-501-Lab5Ex1
//**********************************************************************
public class RowMaxNum {

	// ------------------------------------------------------------------
	// Reads in "input.csv" and returns the largest number in each row
	// ------------------------------------------------------------------

	public static void main(String[] args) throws IOException {
		int rowNum = 1;

		String fileName = "input.csv";
		File f = new File(fileName);
		Scanner fileScan = new Scanner(f);

		System.out.println("Maximum values");

		// reads file line by line
		while (fileScan.hasNext()) {
			int max = 0; // max value of each line is set to 0
			String line = fileScan.nextLine(); // scans the next line in the file

			// splits the string on the commas and puts in array in order to access
			// each element.
			String[] splitLine = line.split(",");

			/*
			 * length of the nums in the line (not total characters) is needed or else
			 * OutOFBounds Exception is thrown. Number amount in each line is always +1 in
			 * respect to ",".
			 */

			// loops through each element of splitLine[] and compares to max. updating max
			// when needed
			for (int i = 0; i < (line.length() + 1) / 2; i++) {
				if (max < Integer.parseInt(splitLine[i])) {
					max = Integer.parseInt(splitLine[i]);
				}

			}
			// prints out the max after each row is evaluated
			System.out.println("ROW " + rowNum + ": " + max);
			rowNum++;

		}
		fileScan.close();

	}
}
