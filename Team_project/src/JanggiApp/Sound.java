package JanggiApp;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
		

public void PlaySound(){
	try{
		Clip clip = AudioSystem.getClip();
		clip.open(AudioSystem.getAudioInputStream(new File("move.wav")));
		clip.start();
		
		Thread.sleep(clip.getMicrosecondLength()/1000);
	}catch(Exception e){
		System.out.println("error");
	}
}

}
