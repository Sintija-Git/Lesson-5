package Lesson5;
import java.util.Scanner;
/* uses instantiable class to determine the properties of the number entered by the user
 * 
 * 
 */

public class SmartNumberApp {
	public static void main(String[] args) {
		//declare local variable to store users input
		int n;
		//declare boolean variable to store the property of the number 
		boolean property;
//		/create an object of type SmartNumber
		SmartNumber number = new SmartNumber();
		Scanner myScanner = new Scanner (System.in);
		System.out.println ("Please enter an integer number here -> ");
		n = myScanner.nextInt();
		
			
		property = number.isNumberEven (n);
		System.out.println ("is " + n + " even? " + property);
	}

}
