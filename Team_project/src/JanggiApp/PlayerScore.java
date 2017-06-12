package JanggiApp;

import java.io.Serializable;

public class PlayerScore implements Serializable {

	private int Rscore = 0;
	private int Bscore = 0;

	public int getRscore() {
		return Rscore;
	}

	public void setRscore(int Rscore) {
		if (Rscore > 0)
			this.Rscore = Rscore;
		else
			this.Rscore = 0;
	}

	public int getBscore() {
		return Bscore;
	}

	public void setBscore(int Bscore) {
		if (Bscore > 0)
			this.Bscore = Bscore;
		else
			this.Bscore = 0;
	}

}
