package Rent;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Rent {
	public static void main(String[] args)
  {
    // Declarations
    int level;
		int bedrooms;
		double[][] aptCost = { { 750.00, 850.00, 950.00, 1050.00 }, 
                                      { 900.00, 1000.00, 1100.00, 1200.00 },
                                      { 1075.00, 1175.00, 1275.00, 1375.00 } };
    
    // Heading
    System.out.println("Apartment Leasing Application by Steven Conyers\n");
    
    // Creates scanner object
    Scanner myInput = new Scanner(System.in);
    
    // Get user input for level with do-while-while
    do {
      System.out.print("What level apartment would you like? ");
      level = myInput.nextInt();
      
      while (level < 0 || level > 2) {
        System.out.print("Your choice was out of range." + " Would you like a" + " level '0', '1', or '2' apartment! ");
        level = myInput.nextInt();
      }
    } while (level < 0 || level > 2);

		// Get User input for rooms
		do {
			System.out.print("How many bedrooms would you like?    ");
			bedrooms = myInput.nextInt();

		while (bedrooms < 0 || bedrooms > 3)
    {
      System.out.print("Your choice was out of range." + " Would you like a" + " '0', '1', '2', or '3' bedroom apartment? ");
      bedrooms = myInput.nextInt();
    }
		} while (bedrooms < 0 || bedrooms > 3);
    
    // For statements for Array
    for (int levels = 0; levels < level; levels++)
    { 
      for (int rooms = 0; rooms < bedrooms; rooms++);
    }
    
    // Create a DecimalFormat object to format aptCost output
    DecimalFormat dollar = new DecimalFormat("#,##0.00");
    
    // Prints apartment cost
    System.out.println("\nThe leasing cost for this apartment wil be: $" + dollar.format(aptCost[level][bedrooms]));
  }
}
