import javax.swing.JOptionPane;

public class ChangeMaking {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Enter an amount. "
				+ "Use dollars and cents. \nExample: 1.56");
		double num = Double.parseDouble(input);
		//JOptionPane.showMessageDialog(null, "You entered " + num);
		
		int cents = (int) (num * 100);
		int quarters = cents/25;
		int dimes = (cents - quarters * 25) / 10;
		int nickels = (cents - quarters * 25 - dimes * 10)/5;
		int pennies = cents - quarters * 25 - dimes * 10 - nickels * 5;
		
		JOptionPane.showMessageDialog(null, "$" + num + " is " 
				+ quarters + " quarters and "
				+ dimes + " dimes and "
				+ nickels + " nickels and " 
				+ pennies + " pennies.");
		
		
		
		

	}

}
