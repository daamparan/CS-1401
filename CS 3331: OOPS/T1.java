/**
 * Thread 1 will play do, mi, sol, si, and do 
 * will also implemet the file player class
 * 
 * @author David Amparan
 * @version 1.0
 */
public class T1 extends Thread {
	/**
	 * 
	 * Depict the behavior of the thread by giving time it 
	 * will be allowed to sleep 
	 * @author David Amparan
	 * 
	 */
	//Extra note is added so that Do-Octave is heard with the audio
	public void run() {
		String[] sound=new String[5];
		sound[0]="C:\\Users\\David\\Desktop\\UTEP\\Fall 2019\\CS3331\\Assignment 6 Resources\\Sounds\\do.wav";
		sound[1]="C:\\Users\\David\\Desktop\\UTEP\\Fall 2019\\CS3331\\Assignment 6 Resources\\Sounds\\mi.wav";
		sound[2]="C:\\Users\\David\\Desktop\\UTEP\\Fall 2019\\CS3331\\Assignment 6 Resources\\Sounds\\sol.wav";
		sound[3]="C:\\Users\\David\\Desktop\\UTEP\\Fall 2019\\CS3331\\Assignment 6 Resources\\Sounds\\si.wav";
		sound[4]="C:\\Users\\David\\Desktop\\UTEP\\Fall 2019\\CS3331\\Assignment 6 Resources\\Sounds\\do-octave.wav";

		String[] toPrintS= {"Do","Mi", "Sol", "Si", "Do-Octave",""};
		//File player to play the music
		FilePlayer Player=new FilePlayer();
		//we begin to player the new file
		for(int i=0; i<5;i++) {
			try {
				T1.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Player.play(sound[i]);
			System.out.println(toPrintS[i]);

		}
	}
}
