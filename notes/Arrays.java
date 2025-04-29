package Notes;

public class Arrays {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] value = new int[6];
		value[0] = 1;
		value[1] = 5;
		value[2] = 2;
		value[3] = 8;
		value[4] = 13;
		value[5] = 6;
//or 
		int[] numbers = {1, 5, 2, 8, 13, 6, -12};
		
		for (int i = 0; i < numbers.length; i++) {
			
			//System.out.println(i);
			
		}
		
		int[] array1 = {10,20,30,40};
		int[] array2 = {40,50,60};
		
		for (int i = 0 ; i < array2.length; i++){
			System.out.println(array2[i]);
		}
		
		// combining arrays
		
		//array3 = array1 + array2
		//1 merge both index lengths from array1 & array2 into array3
		
		System.out.println("===========1==============");

		int[] array3 = new int [array1.length +array2.length];
		
		System.out.println(array3.length); // 6 indexes
		
		System.out.println("============2=============");
		
		//2 copy array1 elements and put them into array 3
		
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
			
			//System.out.println(array3[i]);
		} 
		
		System.out.println("===========3==============");
		
		//3 copy elements from array2 and place them into array 3
		
		for (int i = 0; i  < array2.length; i++) {
			array3[i + array1.length] = array2[i];
			
			//System.out.println(array3[i + array2.length]);
		}

		System.out.println("===========4==============");

		//4 iterate through the new array3 and print all of the elements
		
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
			}
			
//		

		String student1 = "Jake";
		String student2 = "Sarah";
		String student3 = "Paul";
		

		
		
		// Arrays can hold multiple values:
		
	
			
		System.out.println("===============================");//same thing for both for loops examples
		
		
			// starting an array for groceries or products
			
			String[] product = new String[5];
			

			product[0] = "Carrots";
			product[1] = "Pinapples";
			product[2] = "Plums";
			product[3] = "Cucumber";
			product[4] = "Strawberries";
			
			for (String groceries : product) {
				System.out.println("Products: " + groceries);
			}
			
		}
	}   
	


