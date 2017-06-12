package JanggiApp;

import java.io.Serializable;

public class PlayerScore implements Serializable {
	
	private int Rscore = 0;
	private int Bscore = 0;

	public int getRscore() {
		return Rscore;
	}

	public void setRscore(int Rscore) {
		this.Rscore = Rscore;
	}

	public int getBscore() {
		return Bscore;
	}

	public void setBscore(int Bscore) {
		this.Bscore = Bscore;
	}

}
