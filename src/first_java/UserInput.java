package first_java;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Waht is your name?");
		String name = scanner.nextLine();
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		scanner.nextLine();
		// this is for not ignoring if the next asking again a string!
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
	}

}
