package Lesson5;
import java.util.Scanner;
import lesson3.*; //this is in collaboration with SimpleCalculator class from different package that is accessed like this

public class IfCalculatorValid { 

	public static void main (String [] args) {
		
		//input
		//prompt user to specify the operation to be performed
			System.out.println ("Choose operation: ");
			System.out.println ("addition -- 1: ");
			System.out.println ("subtraction -- 2: ");
			System.out.println ("multiplication --3: ");
			System.out.println ("devision --4");
			
			//declare and create an obj of type Scanner
			
			Scanner input = new Scanner(System.in);
			
			// declare local variable to store the users choice 
			int operation = input.nextInt(); // read and return 1 int value
				
			if (operation != 1 && operation != 2 && operation != 3 && operation != 4) {
				System.out.println ("Check ur operation numbers! ");
				
			} else {//otehrwise, if op is valid execute next statement  thats in the {body}
				System.out.println ("Please enter 1st number: ");
				int n1 = input.nextInt();
				
				System.out.println ("Please enter 2nd number: ");
				int n2 = input.nextInt();
				
				//declare and create type of  object SimpleCalculator !!! From lesson 4?? but has to be in the same pcg?
				SimpleCalculator myCalc = new SimpleCalculator();
					//set meth to store value n1 to the firstNumber of instance variable and n2 to the secondNumber (in SImpleCalculator)																																																																																		
				myCalc.setFirstNumber(n1);
				myCalc.setSecondNumber(n2);
				
				//PROCESS
				
				
				if (operation ==1 ) {
					//call add() method on the obj to perform the addition
					myCalc.add();
					//call add() method on the obj to perform the subtraction
				} else if (operation == 2) {
					myCalc.subtract();
					
				} else if (operation == 3) {
					myCalc.multiply();
					
				} else if (operation == 4) {
					myCalc.devide();
					
				}
				// OUTPUT
				
				double res = myCalc.getResult();
				System.out.println ("Result  " + res);
			} //end of else
			
			
			
	}
	
	
}
