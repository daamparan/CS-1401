/**
 * Player for the threads and their sounds 
 * Will run both threads and print each of
 * the keys that are being played
 * 
 * @author David Amparan
 * @version 1.0
 *
 */

public class SoundPlayer {
	public static void main(String[] args) {
		T1 Thread1 = new T1();
		Thread1.start();
		T2 Thread2=new T2();
		Thread2.start();
	}
}
