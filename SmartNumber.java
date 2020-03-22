package Lesson5;
/* SmartNumber.java computes property value of number 
 * If we do not declare variable with parameter, then our smart number calss will provide us with constructor.  
 * After declaring it, we can use our cunst in different classes
 */
public class SmartNumber {

//declare empty construtor
	public SmartNumber () {
	System.out.println ("Starting the app..");
	System.out.println ();
	}

// compute if the number is even. It will return TRUE if so! Otherwise it returns FALSE!!!
	public boolean isNumberEven (int number) {
		//declare a variable to store whether the number is even
		boolean isEven = false;
		int reminder = number % 2;
		
		if (reminder == 0) {
				isEven = true;
		}
		return isEven; // this is false somehow, not sure how
		
	
		
	}
	
	
	
	

}
