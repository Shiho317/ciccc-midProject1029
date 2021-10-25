package janken_game;

public class WinOrLose {
	private static int point = 0;
	public static final void decisionWinOrLose(int computerHand,int playerHand) {
		int playerHandTemp = playerHand;
		playerHandTemp++;
		
		if (playerHand == computerHand) {
			Panel.headerLabel.setText("Draw!（" + point + "）");
		}
		else if ((playerHand == 3 && computerHand == 1)||(playerHandTemp == computerHand)) {
			point+=1;
			Panel.headerLabel.setText("You won!（" + point + "）");
		}			
		else {
			point=0;
			Panel.headerLabel.setText("You lost!（" + point + "）");
		}
	}

}
