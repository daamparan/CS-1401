
import java.util.*;
/**State machine for Moon Rover assignment 4
 * It will traverse each state; give the options to move on 
 * Depict what action must be given and will directly 
 * send to whichever state needed
 * 
 * @author David Amparan
 * @version 1.0
 * @since 1.0
 */

public class Rover {
	
	public Rover(){
	}
	
	static Scanner scnr=new Scanner(System.in);
	
	public static void main (String [] args) {
		//will take the first answer the user would like
		System.out.println("Welcome to the Apollo Rover");
		idle_state();
	}
	
	/**
	 * Depicts the accelerate forward state behavior 
	 * Lists user choices and allows for the answer to be taken 
	 * 
	 * @author David Amparan
	 * @param None
	 * @return Integer
	 */
	public static int accelerate_forward() {
		System.out.println();
		
		System.out.println("------------------------------------");
		System.out.println("Current State: Accelerate Forward");
		System.out.println("------------------------------------");

		int userAns;
		//Scanner scnr=new Scanner(System.in);
		System.out.println("1. Press Right Pedal Twice to deccelarate forward");
		System.out.println("2. Press Right Pedal for 5 Seconds to constantly go forward");
		System.out.println("3. Press Left Pedal once to go back to idle");
		System.out.println("0. To Turn off rover");
		System.out.println("Please Enter option desired");
		System.out.println();

		userAns=scnr.nextInt(); 
		//here we have if statements to select the next state
		if(userAns==0) {
			//System.exit(0);
			return userAns;
		}
		else if(userAns==1) {
			//deccelerate_forward();
			return userAns;
		}
		else if(userAns==2) {
			//constant_forward();
			return userAns;
		}
		else if(userAns==3) {
			//idle_state();
			return userAns;
		}
		return 0;
	}
	
	/**
	 * Depicts the idle state behavior 
	 * Lists user choices and allows for the answer to be taken 
	 * 
	 * @author David Amparan
	 * @param None
	 * @return Integer
	 */
	public static int idle_state() {
		int userAns;
		//Scanner scnr=new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("Current State = Idle");
		System.out.println("---------------------");
		
		System.out.println("1. Press Right Pedal Once to accelerate forward");
		System.out.println("2. Press Left Pedal for 5 Seconds to accelerate backwards");
		System.out.println("0. To Turn off the rover");
		System.out.println("Please Enter option desired");
		System.out.println();

		userAns=scnr.nextInt();
		
		if(userAns==0) {
			//System.exit(0);
			return userAns;
		}
		else if(userAns==1) {
			//accelerate_forward();
			return userAns;
		}
		else if(userAns==2){
			//accelerate_backward();
			return userAns;
		}
		return 0;
	}
	/**
	 * Depicts the accelerate backwards state behavior 
	 * Lists user choices and allows for the answer to be taken 
	 * 
	 * @author David Amparan
	 * @param None
	 * @return Integer
	 */
	public static int accelerate_backward() {
		System.out.println("-----------------------------------");
		System.out.println("Current State: Accelerate Backward");
		System.out.println("-----------------------------------");

		int userAns;
		//Scanner scnr=new Scanner(System.in);
		System.out.println("1. Press Left Pedal Twice to deccelarate backwards");
		System.out.println("2. Press Left Pedal 5 secs to go back to idle");
		System.out.println("0. To Turn off rover");
		System.out.println("Please Enter option desired");
		System.out.println();

		userAns=scnr.nextInt();
		if(userAns==0) {
			//System.exit(0);
			return userAns;
		}
		else if(userAns==1) {
			//deccelerate_backward();
			return userAns;
		}
		else if(userAns==2) {
			//idle_state();
			return userAns;
		}
		return 0;
	}
	/**
	 * Depicts the deccelerate backwards state behavior 
	 * Lists user choices and allows for the answer to be taken 
	 * 
	 * @author David Amparan
	 * @param None
	 * @return Integer
	 */
	public static int deccelerate_backward() {
		System.out.println("-------------------------------------");
		System.out.println("Current State: Deccelerate Backward");
		System.out.println("-------------------------------------");

		int userAns;
		//Scanner scnr=new Scanner(System.in);
		System.out.println("1. Press Left Pedal for 5 secs to go back to idle");
		System.out.println("2. Press Left Pedal twice to accelerate forward");
		System.out.println("0. To Turn off rover");
		System.out.println("Please Enter option desired");
		System.out.println();
		userAns=scnr.nextInt();
		
		if(userAns==0) {
			//System.exit(0);
			return userAns;
		}
		else if(userAns==1) {
			//idle_state();
			return userAns;
		}
		else if(userAns==2) {
			//accelerate_backward();
			return userAns;
		}
		return 0;

	}
	
	/**
	 * Depicts the deccelerate forward state behavior 
	 * Lists user choices and allows for the answer to be taken 
	 * 
	 * @author David Amparan
	 * @param None
	 * @return Integer
	 */
	public static int deccelerate_forward() {
		System.out.println("------------------------------------");
		System.out.println("Current State: Deccelerate Forward");
		System.out.println("------------------------------------");

		int userAns;
		//Scanner scnr=new Scanner(System.in);
		System.out.println("1. Press Right Pedal for 5 seconds to go constantly forawrd");
		System.out.println("2. Press Left Pedal once to go back to idle");
		System.out.println("3. Press  Right Pedal twice to accelerate forward");
		System.out.println("0. To Turn off rover");
		System.out.println("Please Enter option desired");
		userAns=scnr.nextInt();
		System.out.println();

		if(userAns==0) {
			//System.exit(0);
			return userAns;
		}
		else if(userAns==1) {
			//constant_forward();
			return userAns;
		}
		else if(userAns==2) {
			//idle_state();
			return userAns;
		}
		else if(userAns==3) {
			/*accelerate_forward();*/
			return userAns;
		}
		return 0;

	}
	
	/**
	 * Depicts the constant forward state behavior 
	 * Lists user choices and allows for the answer to be taken 
	 * 
	 * @author David Amparan
	 * @param None
	 * @return Integer
	 */
	public static int constant_forward() {
		System.out.println("---------------------------------");
		System.out.println("Current State: Constant Forward");
		System.out.println("----------------------------------");

		int userAns;
		//Scanner scnr=new Scanner(System.in);
		System.out.println("1. Press Left Pedal once to go back to idle");
		System.out.println("2. Press Right Pedal for 5 secs to go to decelerate backwards");
		System.out.println("3. Press Right Pedal twice to accelerate forward");
		System.out.println("0. To Turn off rover");
		System.out.println("Please Enter option desired");
		userAns=scnr.nextInt();
		System.out.println();

		if(userAns==0) {
			//System.exit(0);
			return userAns;
		}
		else if(userAns==1) {
			//idle_state();
			return userAns;
		}
		else if(userAns==2) {
			//deccelerate_forward();
			return userAns;
		}
		else if(userAns==3) {
			//accelerate_forward();
			return userAns;
		}
		return 0;

	}
}
