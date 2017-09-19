import javax.swing.JOptionPane;

public class ChangeMaking {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Enter your first amount of change. "
				+ "Use dollars and cents. \nExample: 1.56");
				
		double num1 = Double.parseDouble(input);
		//JOptionPane.showMessageDialog(null, "You entered " + num);
		String input2 = JOptionPane.showInputDialog(null, "Enter your second amount of change."
				+ "Use dollars and cents. \nExample: 1.56");
		double num2 = Double.parseDouble(input2);
		double average = (num1 +num2)/2;
				
		int cents = (int) (num1 * 100);
		int quarters = cents/25;
		int dimes = cents % 25 / 10;
		int nickels = cents % 25 % 10 / 5;
		int pennies = cents % 25 % 10 % 5;
		
		int cents2 = (int) (num2 * 100);
		int quarters2 = cents2/25;
		int dimes2 = cents2 % 25 / 10;
		int nickels2 = cents2 % 25 % 10 / 5;
		int pennies2 = cents2 % 25 % 10 % 5;
		
		
		JOptionPane.showMessageDialog(null, "Your average is " + "$" + average + ". \n"
				+ "Your first change, $" + input + ", is " 
				+ quarters + " quarters, "
				+ dimes + " dimes, "
				+ nickels + " nickels, and " 
				+ pennies + " pennies."
				+ "\nYour second change, $" + input2 + ", is "
				+ quarters2 + "quarters, "
				+ dimes2 + " dimes, "
				+ nickels2 + " nickels, and "
				+ pennies2 + " pennies.");

	}

}
