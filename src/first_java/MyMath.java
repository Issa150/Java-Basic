package first_java;
import java.util.Random;
public class MyMath {

	public static void main(String[] args) {
		/*double width = 3.15;
		double height = 7.25;
		
		double bigest = Math.max(width, height);
		System.out.println(bigest);
		*/
		Random random = new Random();
		int x = random.nextInt(6)+1;
		System.out.println(x);
		
	}

}
