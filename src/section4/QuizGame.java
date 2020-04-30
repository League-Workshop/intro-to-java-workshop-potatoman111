package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int Score = 0;
		// 2.  Ask the user a question 
	String question = JOptionPane.showInputDialog("what's the capital of America.");
		// 3.  Use an if statement to check if their answer is correct
		if(question.equals("Washington D.C")) {
		
		JOptionPane.showMessageDialog(null, "correct");
		Score++;
		
		} else {
			
		JOptionPane.showMessageDialog(null, "incorrect");	
		}
		// 4.  if the user's answer was correct, add one to their score 
		question = JOptionPane.showInputDialog("can 2 be written as a fraction.");
		if(question.equals("no")) {
			
			JOptionPane.showMessageDialog(null, "correct");
			Score++;
			
			} else {
				
			JOptionPane.showMessageDialog(null, "incorrect");	
			}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		question = JOptionPane.showInputDialog("is your favorite color blue");
		if(question.equals("yes")) {
			
			JOptionPane.showMessageDialog(null, "good job");
			Score++;
			
			} else {
				
			JOptionPane.showMessageDialog(null, "that's wierd");	
			}
		// 6.  After all the questions have been asked, print the user's score 
		question = JOptionPane.showInputDialog("what is the average wing speed of a swallow");
		if(question.equals("I don't know")) {
			
			JOptionPane.showMessageDialog(null, "me to");
			Score++;
			
			} else {
				
			JOptionPane.showMessageDialog(null, "wrong");	
			}
	JOptionPane.showMessageDialog(null, "this is your score."+ Score);
	}
}
