package Notes;

public class WhileLoops {
	public static void main(String [] args) {
		int userNumber = 1;
		if (userNumber >= 1 && userNumber <= 100) {
    		int i = userNumber;
    		while(i <= 20) {
    		    System.out.println(i);
    			i++;
    		} 
    	} else {
    		System.out.println("Your number was not between 1 and 100.");
    	}
		System.out.println("===============================================");
	
		/*Create a for loop that prints out a multiplication table from 1 through 10 for a given variable num.
		Print the multiplication table to the console
		Make sure the spacing is the same as the expected output
		For example, if the value of num is 1, each iteration of the loop should look like the following:
		1 x 1 = 1
		1 x 2 = 2
		1 x 3 = 3 … and so on up to 1 x 10 = 10.
		*/
				// sample cases:
		int num = 256;
		int i = 1;
				
		System.out.println("Multiplication Table of " + num + ":");
				
		while(i >= 1 && i <= 10 ) {
			int product = num * i;
			System.out.println(num + " x " + i + " = " + product);
			i++;
			}
		   
		System.out.println("===============================================");
		//Count Down to Launch!!!
		
		
		int countDown = 10;
		
		if (countDown <= 2 || countDown > 10) {
			System.out.println("We have lift off!");
			return;
		}
		while(countDown <= 10 && countDown >= 1) {
			System.out.println(countDown + "...");
			countDown--;
			
		
		}
		System.out.println("We have lift off!");

		
	}
}