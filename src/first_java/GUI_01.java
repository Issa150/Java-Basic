package first_java;
import javax.swing.JOptionPane;
public class GUI_01 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Please enter your name:");
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter you age:"));
		
		JOptionPane.showMessageDialog(null, "Hello " + name);
		JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
	}
	
}