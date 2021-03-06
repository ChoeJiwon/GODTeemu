package Menu;

import java.io.*;

public class SoundSettingFile implements Serializable {
	// when on  combo box is selected, store true
	// when off combo box is selected, store false
	public static void conductSerializing(String s){
		try{
			FileOutputStream fos = new FileOutputStream("sound.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			out.writeObject(s);
			out.close();
			System.out.println("���� : "+s);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	// when a piece moves, if stored sound.txt is true, play sound
	public static boolean DeconductSerializing(){
		String s;
		boolean b = true;
		try{
			FileInputStream fis = new FileInputStream("sound.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream in = new ObjectInputStream(bis);
			
			s = (String) in.readObject();
			b = Boolean.valueOf(s).booleanValue();
			System.out.println(""+b);
			in.close();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return b;
	}
}
