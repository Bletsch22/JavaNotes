package notes;

public class MultideminsionalArrays {
	
	public static void main(String[] args) {

		// 2D array= an array of array
		
		// ex. one of a 3 row 2d arry
		String[][] cars = new String[3][3];
		
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		
		cars[1][0] = "Mustang";
		cars[1][1] = "Ranger";
		cars[1][2] = "F-150";
		
		cars[2][0] = "Jeep";
		cars[2][1] = "Ram 1500";
		cars[2][2] = "Charger";

		
		for(int i = 0; i< cars.length; i++ ) {
			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println("============================");
		// ex two
		String[][] animals = {
		{"dogs", "cats","deer"},
		{"Hawks", "Cardinals", "Blue Jays"}, 
		{"Trout", "Catfish", "Bass",}
		}; 
		
		
		for (int a = 0; a < animals.length; a++) {
			for (int b = 0; b < animals[a].length; b ++) {
				System.out.print(animals[a][b] + " ");
			}
			System.out.println();
		}
		

		}

}
