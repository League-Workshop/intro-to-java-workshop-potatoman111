package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String question = JOptionPane.showInputDialog(null, "do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.

		if(question.equals("yes")) {
		
		JOptionPane.showMessageDialog(null, "you rule the world!");
		
		} else {
	
		JOptionPane.showMessageDialog(null,  "goodluck washing dishes.");
		}
		
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

