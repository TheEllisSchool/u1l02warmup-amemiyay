import javax.swing.JOptionPane;

public class ChangeMaking {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Enter an amount. "
				+ "Use dollars and cents. \nExample: 1.56");
		double num = Double.parseDouble(input);
		//JOptionPane.showMessageDialog(null, "You entered " + num);
		
		int cents = (int) (num * 100);
		int nickels = cents/5;
		int pennies = cents - nickels * 5;
		
		JOptionPane.showMessageDialog(null, "$" + num + " is " 
				+ nickels + " nickels and " 
				+ pennies + " pennies.");
		
		
		
		

	}

}
