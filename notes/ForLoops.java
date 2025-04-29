package notes;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//For loops 
		// Good for looping through lists and batch of items.
		// i ++ is also i + i or i += 1. it just adds 1 + to i .
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			//System.out.println("scoop cup of flower");
		}
	System.out.println("==================");
	
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}// prints out 1 - 10
		
		int userValue = 1;
		
		if (userValue > 20) {
			System.out.println(1); 
			return; 
		}
	System.out.println("====================");
		
		for(int count = 1; count <= 20; count += userValue){
			System.out.println(count);
		}
		System.out.println("====================");

		for(int counter = 10; counter >= 0; counter -- ){
			System.out.println(counter);
			}
			
		System.out.println("==========================");	
		int base = 2;
		int power = 5;
		int result = 1;
			
		for (int i = 1; i <= power; i++) {
				result *= base;
		}
		System.out.println(result);
			
		
	



		/*	Write a for loop that starts at zero and loops the length of a user-entered String saved in the
	    given variable userWord. Every time the loop runs, the userWord is added to the given variable longString to make a repeating string.
	
	*	For example, if String userWord = "Hello", the loop would run 5 times and concatenate the word
	    "Hello" to longString 5 times, because "Hello" has 5 letters. The output would be HelloHelloHelloHelloHello.
	
	*	Every time the loop processes, userWord should be added to longString
	
	*	Outside of the for loop, use System.out.println(); to print longString to the console.
*/
		
		
		String userWord = "Amazing!";
		
		for (int i = 0; i <= userWord.length();i++) { 	
		}
		
		
	}
}


