package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		Random r = new Random();
		String input = JOptionPane.showInputDialog(null, "what do you think is awesome");
		int number = r.nextInt(4);
		JOptionPane.showMessageDialog(null, number);

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"

		// 3. Print out this variable

		// 4. Get the user to enter something that they think is awesome
		
		// 5. If the random number is 0
		if (number == 0) {

			JOptionPane.showMessageDialog(null, "That's Awesome");
			// -- tell the user whatever they entered is awesome!
		}
		// 6. If the random number is 1

		if (number == 1) {

			JOptionPane.showMessageDialog(null, "That's OK");
			// -- tell the user whatever they entered is ok.

			// 7. If the random number is 2
		}
		if (number == 2) {

			JOptionPane.showMessageDialog(null, "That's Boring");
			// -- tell the user whatever they entered is boring.
		}
		// 8. If the random number is 3
		if (number == 3) {

			JOptionPane.showMessageDialog(null, "That's Absolutely Stupid!!");
			// -- write your own answer
		}
	}
}
