package notes;

public class DoWhileLoops {
	public static void main(String[] args) {
		 int number = 5;
		 do {
			 System.out.println(number);
		        number--;
		 	} while (number >= 1);
		    System.out.println("Blast off!");
	
		System.out.println("===============================");
		
		int numToAdd = 3;
		int howManyTimes =8 ;
	
		int sumResult = 0;
		int count = 0;
	
		do {
			sumResult += numToAdd;
			count++;
		}while (count < howManyTimes);
	
		System.out.println(sumResult);
	
		System.out.println("===============================");
		
		int userNumber = 11;

		
		if (userNumber > 10 && userNumber < 100) {
			do {
				
				System.out.println(userNumber);
				userNumber--;
				
			}while (userNumber >= 10);
			
		}else if (userNumber <= 10 || userNumber >= 100) {
				System.out.println("\"Your number is not a value that is more than 10 and less than 100.\"");
			}
		
		System.out.println("===============================");


	
	}
	

}
