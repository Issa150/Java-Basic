package first_java;

public class Main {

	public static void main(String[] args) {
		String x = "This is asigned to X";
		String y = "This is asigned to Y";
		String temp = null;
		
		temp = x;
		x = y;
		y = temp;
		
		
		System.out.println("Now X = " + x);
		System.out.println("Now Y = " + y);
	}

}
