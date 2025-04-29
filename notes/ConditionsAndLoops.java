package notes;

public class ConditionsAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double assignment1 =70;
	     double assignment2 =71;
	     double assignment3 =88;
	     double assignment4 =91;
	    
	    if ((assignment1 + assignment2 > 150) && (assignment3 >70 || assignment4 > 70)) {
	    		System.out.println("You Passed the class.");
	    	
	    }else {
	    	System.out.println("You failed the class.");
	    }

	    System.out.println("===================================");
	    System.out.println(18);
	    System.out.println("");
	
	    boolean isRaining = true;
	    
	    if(!isRaining){
	      System.out.println("It's not raining, so I can go for a walk.");
	    } else {
	      System.out.println("It's raining, so I'll stay indoors.");
	    }
	
	    System.out.println("===================================");
	    System.out.println(19);
	    System.out.println("");
	
	    char vowel = 's';
	    
	    if (vowel == 'a'||vowel == 'e'||vowel ==  'i'||vowel ==  'o' || vowel ==  'u') {
	    	System.out.println("Its a vowel!");
	    	
	    }else {
	    	System.out.println("Its a consonant");
	    }
	
	    System.out.println("===================================");
	    System.out.println(20);
	    System.out.println("");
	
	    int num = 15;

	    System.out.println(num % 2 == 0 && num % 3 == 0);
	    
	    System.out.println("===================================");
	    System.out.println();
	    System.out.println("");
	}

}
