package janken_game;

public class WinOrLose {
	private static int point = 0;
	public static final void decisionWinOrLose(int computerHand,int playerHand) {
		
		if (playerHand == computerHand) {
			Panel.headerLabel.setText("Draw!（" + point + "）");
		}
		else if ((playerHand == 3 && computerHand == 1)||(playerHand == 1 && computerHand == 2)|| (playerHand == 2 && computerHand == 3)) {
			point+=1;
			Panel.headerLabel.setText("You won!（" + point + "）");
		}			
		else {
			point=0;
			Panel.headerLabel.setText("You lost!（" + point + "）");
		}
	}

}
