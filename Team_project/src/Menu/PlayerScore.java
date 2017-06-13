package Menu;

import java.io.Serializable;

public class PlayerScore implements Serializable {

	private int Rscore = 0;             //variable to store red score
	private int Bscore = 0;             //variable to store blue score

	
	/*getter to return red score*/
	public int getRscore() {
		return Rscore;                 
	}

	
	/*setter to establish a range of red score*/
	public void setRscore(int Rscore) {
		if (Rscore > 0)
			this.Rscore = Rscore;
		else
			this.Rscore = 0;
	}

	
	/*getter to return blue score*/
	public int getBscore() {
		return Bscore;
	}

	
	/*setter to establish a range of red score*/
	public void setBscore(int Bscore) {
		if (Bscore > 0)
			this.Bscore = Bscore;
		else
			this.Bscore = 0;
	}

}
