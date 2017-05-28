package JanggiApp;

import java.io.*;


public class SoundSettingFile implements Serializable {
	public static void conductSerializing(String s){
		try{
			FileOutputStream fos = new FileOutputStream("sound.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			out.writeObject(s);
			out.close();
			System.out.println("¼º°ø : "+s);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
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
