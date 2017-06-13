package Menu;

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

	
	/*store score in text file*/
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
	
	
	/*load a file to read player RED score*/
	public int readRScore() {
		
		int r = 0;  //red score (initial state) 
		try {
			FileInputStream fis = new FileInputStream("score.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);
			
			s = (PlayerScore) in.readObject();
			r = s.getRscore();
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return r;
	}
	
	/*load a file to read player RED score*/
	public int readBScore() {
		
		int b = 0;   //blue score(initial state)
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
