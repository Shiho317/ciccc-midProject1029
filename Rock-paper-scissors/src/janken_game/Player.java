package janken_game;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Player implements ActionListener{
	public static void createButton(JPanel footerPanel) {
	//button
			JButton btnRock = new JButton("Rock");
			btnRock = setButton(btnRock);
			footerPanel.add(btnRock, BorderLayout.WEST);
			
			JButton btnScissors = new JButton("Scissors");
			btnScissors = setButton(btnScissors);
			footerPanel.add(btnScissors, BorderLayout.CENTER);
			
			JButton btnPaper = new JButton("Paper");
			btnPaper = setButton(btnPaper);
			footerPanel.add(btnPaper, BorderLayout.EAST);
			
	}
public static JButton setButton(JButton button) {
		int buttonSizeX = (640 - 20)/3;
		Dimension buttonDimesion = new Dimension(buttonSizeX, 50);
		button.setPreferredSize(buttonDimesion);
		Font buttonFont = new Font("senrif",Font.PLAIN,24);
		button.setFont(buttonFont);
		Player player = new Player();
		button.addActionListener(player);
		return(button);
	}
public void actionPerformed(ActionEvent e) {
	String command = e.getActionCommand();
	int playerHand = 0;
	if (command.equals("Rock")) playerHand = 1;
	else if (command.equals("Scissors")) playerHand = 2;
	else if (command.equals("Paper"))  playerHand = 3;
	
	int computerHand = Computer.decidesComputerHand();
	WinOrLose.decisionWinOrLose(computerHand, playerHand);
}
}