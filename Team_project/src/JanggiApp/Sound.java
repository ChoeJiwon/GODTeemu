package JanggiApp;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Sound {
	// play sound method
	public void PlaySound(){
		try{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(new File("move.wav")));
			clip.start();
			
			Thread.sleep(clip.getMicrosecondLength()/1000);
		}catch(Exception e){
			 JOptionPane.showConfirmDialog(null,
						"File Error!!", "Error",
						JOptionPane.OK_OPTION, JOptionPane.ERROR_MESSAGE, null);
		}
	}
}