package JanggiApp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class ScoreFile {
	
	/*Make Object(PlayerScore)*/ 
	private PlayerScore s = new PlayerScore();

	
	/*store score in texfile*/
	public void storeScore(int Bs, int Rs) {
		try {
			FileOutputStream fos = new FileOutputStream("score.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream out = new ObjectOutputStream(bos);

			s.setBscore(Bs);
			s.setRscore(Rs);

			out.writeObject(s);
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public int readRScore() {
		
		int b = 0;
		try {
			FileInputStream fis = new FileInputStream("score.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);
			
			s = (PlayerScore) in.readObject();
			b = s.getRscore();
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return b;
	}

	public int readBScore() {
		
		int b = 0;
		try {
			FileInputStream fis = new FileInputStream("score.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);
			
			s = (PlayerScore) in.readObject();
			b = s.getBscore();
			in.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "File Error!!");
			}catch (Exception e) {
			e.printStackTrace();
		}

		return b;

	}

}
