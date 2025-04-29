package notes;

public class Booleans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Sam";
		
		if (name == "Sam") {
			System.out.println("Hello Sam");
		} else {
			System.out.println("Hello Poser");
		}
		int age = 12;
		
		if (age >= 16) {
			System.out.println("Age:" +age);
			System.out.println("You can get your drivers license.");
		}else {
			System.out.println("Age:"+ age);
			System.out.println("You are too young for a drivers test.");
			System.out.println("Please wait: " + (16 - age) + " year(s)");
		}
		char grade = 'F';
		
		switch (grade) {
		case 'A':
			System.out.println("90%");
			break;
		case 'B':
			System.out.println("80%");
			break;
		case 'C':
			System.out.println("70%");
			break;
		case 'D':
			System.out.println("60&");
			break;
		default :
			System.out.println("50%");
			break;
		
		}
	}


}
