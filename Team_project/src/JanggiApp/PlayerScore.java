package JanggiApp;

import java.io.Serializable;

public class PlayerScore implements Serializable{
	int player1score,player2score;
	
	public PlayerScore(int player1score,int player2score){
		this.player1score=player1score;
		this.player2score=player2score;
	}
	
	
}
