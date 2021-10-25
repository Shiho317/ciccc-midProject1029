package janken_game;

import java.util.Random;

public class Computer {
	public static int decidesComputerHand() {
		Random random = new Random();
		int pc = random.nextInt(3)+1;
		if (pc == 1) Panel.mainLabel.setText("Rock");
		else if (pc == 2) Panel.mainLabel.setText("Scissors");
		else if (pc == 3) Panel.mainLabel.setText("Paper");
		return (pc);
	}

}
