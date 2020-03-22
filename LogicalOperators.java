package Lesson5;
import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {
		
		int num = 90;
		switch (num) { //switch case is similar to if statement - 
		case 10:
			System.out.println ("Variable is 10");
			break;
		case 80:
			System.out.println ("Variable is 80");
		case 90:
			System.out.println ("Variable is 90");
		default:
			System.out.println ("Variable is something else");	 // if all above are wrong it will print this
		
		
		}
		
		//  ==equal to      x==y
		//  != not equal     x!=y
		//  > grater than 
		//  < less then 
		//  >= grater or equal
		//  <= less or equal
		
		// && LOgical and  - return true if both statements are true x<5 && x<10
		// || logical or - returns true if one statement is true 
		// ! - logical not, that reverses the result, so returns true if result returns true! (
		
		
////		boolean isEven = true;
////		if (isEven) {
////			System.out.println( "boolean is " + isEven);
//		}
		
		Scanner sc = new Scanner (System.in);
		System.out.println ("Please enter your age: ");
		int age = sc.nextInt();
		
		
		if (age < 18) {
		 if (age >= 10 && age <=15) {
		System.out.println ("Its a teen!");
		
		} else if (age >= 16 && age <= 18){
		System.out.println ("Its a grow teenagers age! ");
			
		} else if (age < 10){
			System.out.println ("Childs age! ");
			
		} else if (age == 20 || (age > 21 && age < 99));
			System.out.println ("Its a grownups age! ");
		}
		
	}
}

		
