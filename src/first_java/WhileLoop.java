package first_java;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*String name ="";
		*while(name.isBlank()) {
		*	System.out.println("Enter your name, please!");
		*	name= scanner.nextLine();
		*}
		*System.out.println("Hello " + name);
		*/
		
		
		// nested loop
		int rows;
		int columns;
		String symbol;
		
		System.out.println("Please define number of rows:");
		rows = scanner.nextInt();
		
		System.out.println("PLease define number of columns:");
		columns = scanner.nextInt();
		
		System.out.println("Please choose the symbol:");
		symbol = scanner.next();
		
		
		for(int i = 1; i <=rows ; i++) {
			System.out.println();
			
			for(int j = 1; j<=columns;j++) {
				System.out.print(symbol);
			}
			
		}
		
		/* Output will be like:
		 * 3
		 * 5
		 * $
		 * $$$$$
		 * $$$$$
		 * $$$$$
		 * */
	}

}
