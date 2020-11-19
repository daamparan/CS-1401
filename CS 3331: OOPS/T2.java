/**
 * Second thread in charge of playing re, fa, la, do
 * Will implement the class FilePlayer 
 * 
 * @author David Amparan
 * @version 1.0 
 *
 */
public class T2 extends Thread {
	/**
	 * 
	 * Depict the behavior of the thread by giving time it 
	 * will be allowed to sleep 
	 * @author David Amparan
	 * 
	 */
	//Extra note is added so that Do-Octave is heard with the audio
	public void run() {
		String[] sound=new String[4];
		sound[0]="C:\\Users\\David\\Desktop\\UTEP\\Fall 2019\\CS3331\\Assignment 6 Resources\\Sounds\\re.wav";
		sound[1]="C:\\Users\\David\\Desktop\\UTEP\\Fall 2019\\CS3331\\Assignment 6 Resources\\Sounds\\fa.wav";
		sound[2]="C:\\Users\\David\\Desktop\\UTEP\\Fall 2019\\CS3331\\Assignment 6 Resources\\Sounds\\la.wav";
		sound[3]="C:\\Users\\David\\Desktop\\UTEP\\Fall 2019\\CS3331\\Assignment 6 Resources\\Sounds\\do-octave.wav";

		String[] toPrintS= {"Re","Fa", "La","Do-Octave",""};
		//File player to play the music
		FilePlayer Player=new FilePlayer();
		//we begin to player the new file
		for(int i=0; i<4;i++) {
			try {
				T2.sleep(1580);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			Player.play(sound[i]);
			System.out.println(toPrintS[i]);
			
		}
	}
}
