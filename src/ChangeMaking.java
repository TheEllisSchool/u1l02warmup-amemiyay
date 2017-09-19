import javax.swing.JOptionPane;

public class ChangeMaking {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Enter your first amount of change. "
				+ "Use whole number cents. \nExample: 45");
				
		int num1 = Integer.parseInt (input);
		//JOptionPane.showMessageDialog(null, "You entered " + num);
		String input2 = JOptionPane.showInputDialog(null, "Enter your second amount of change."
				+ "Use whole number cents. \nExample: 45");
		int num2 = Integer.parseInt(input2);
		double average = (num1 + num2)/2;
				
		//int cents = (int) (num1 * 100);
		int quarters = num1/25;
		int dimes = num1 % 25 / 10;
		int nickels = num1 % 25 % 10 / 5;
		int pennies = num1 % 25 % 10 % 5;
		
		//int cents2 = (int) (num2 * 100);
		int quarters2 = num2/25;
		int dimes2 = num2 % 25 / 10;
		int nickels2 = num2 % 25 % 10 / 5;
		int pennies2 = num2 % 25 % 10 % 5;
		
		
		JOptionPane.showMessageDialog(null, "Your average is " + average + " cents. \n"
				+ "Your first change, " + input + " cents, is " 
				+ quarters + " quarters, "
				+ dimes + " dimes, "
				+ nickels + " nickels, and " 
				+ pennies + " pennies."
				+ "\nYour second change, " + input2 + " cents, is "
				+ quarters2 + " quarters, "
				+ dimes2 + " dimes, "
				+ nickels2 + " nickels, and "
				+ pennies2 + " pennies.");

	}

}
