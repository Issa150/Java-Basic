package first_java;

public class MyArray {

	public static void main(String[] args) {
		
		/* String cars[] = {"Mercedes", "Mustang", "Toyota"};
		 for(int i = 0; i < cars.length;i++) {
			System.out.println(cars[i]);
		}
		*/
		String students[][] = 	{ 
									{"Ali", "Hamid", "Sana"},
									{"Samane", "Javad", "Tina"},
									{"Abbas", "Zahra", "Goli"}
								};
		for(int i = 0; i < students.length;i++) {
			System.out.println();
			for(int j=0; j < students[i].length;j++) {
				System.out.print(students[i][j] + "-");
			}
		
		}
	}

}
