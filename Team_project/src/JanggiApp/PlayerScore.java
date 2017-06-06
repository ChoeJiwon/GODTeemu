package JanggiApp;

import java.io.Serializable;

public class PlayerScore implements Serializable{
	private int player1score,player2score;

	public int getPlayer1score() {
		return player1score;
	}

	public void setPlayer1score(int player1score) {
		this.player1score = player1score;
	}

	public int getPlayer2score() {
		return player2score;
	}

	public void setPlayer2score(int player2score) {
		this.player2score = player2score;
	}
	
	
	
}
