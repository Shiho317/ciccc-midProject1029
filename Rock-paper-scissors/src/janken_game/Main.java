package janken_game;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//show to window
		JFrame frame = new JFrame("Rock-paper-scissors Game!!");
		frame.setSize(640, 480);//window size
		frame.setLocationRelativeTo(null);//set center
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set click event to finish
		frame.setResizable(false);//fixed window size
		Panel.createPanel(frame);
		
		//show window
		frame.setVisible(true);
	}
}