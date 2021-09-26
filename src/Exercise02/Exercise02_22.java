package Exercise02;

/* @author Shubham Dankhara  (D21cs108)
 
  Write a program that displays a random uppercase letter 
  using the System.CurrentTimeMillis() method.
  
 */

public class Exercise02_22 {

	public static void main(String[] args) {

		// It Gives Random Number Between 65 to 90.
		long Number = (System.currentTimeMillis() % 26) + 65;

		// Convert Number to char.
		char character = (char) Number;

		// Print Converted Uppercase Letter.
		System.out.println("Random Uppercase Letter Is : " + character);
	}

}
