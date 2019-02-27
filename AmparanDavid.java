/******************************************
 *Author: David Amparan
 *Last Modified: 2/10/2018
 *Instructor: Dr. Ceberio, Martine
 *TA: Kevin Parker, Angel Garcia, Raquel Gonzalez, Maria G. Jimenez
 *
 *
 * Functionality: My program is a random number generator that can give the user a total of 
 * 5 numbers for the lottery. Naturally picking numbers for the lottery can be tricky 
 * as we humans can induce bias by selecting a preferred number or a pattern we 
 * subconsciously create. My program hopefully helps eliminate the bias by giving total randomness.  
 ******************************************/

import java.util.Random;
import java.util.Scanner;

public class AmparanDavid {
    public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		String userName; //Creates a variable for the name of user
		
		System.out.println("Welcome to your solution to Picking Lottery Numbers");
		System.out.println("Enter your name!");
		userName = sc.next(); //userName is declared by the user & the program greets the user 
		
		//this message tells the user the range of numbers & how many can be displayed
		System.out.println(" NOTICE: A range of 1-99 will be used and a total of 5 numbers can be displayed.");
		
		//This message prompts the user for the total number of digits he wants printed
		System.out.println(" Okay " + userName + ", " + " chose how many numbers(1-5) you want displayed and good luck (^ v ^ )/");
		
		int numValues = sc.nextInt(); //numValues is the number of digits displayed 
		
		//An if statement is used for each other possible values of numValues
		if (numValues == 1){ // if one is needed the one will be generated  
		System.out.print(r.nextInt(100));//one number is printed 
		}
		if (numValues == 2){ //if two are needed then only two will be generated 
		System.out.print(r.nextInt(100)); // random generated and printed
		System.out.print(" " + r.nextInt(100)); //random generated and printed
		   }
		else if (numValues == 3 ){//if three are needed only three will be generated 
			System.out.print(r.nextInt(100));//random generated and printed
			System.out.print(" " + r.nextInt(100));//random generated and printed
			System.out.print(" " + r.nextInt(100));//random generated and printed
		   }
		else if (numValues == 4){//if four are needed only four will be generated  
			System.out.print(r.nextInt(100));//random generated and printed
			System.out.print(" " + r.nextInt(100));//random generated and printed
			System.out.print(" " + r.nextInt(100));//random generated and printed
			System.out.print(" " + r.nextInt(100));//random generated and printed
		   }
		else if (numValues > 4 ){//if five are needed then only five will be generated
			System.out.print(r.nextInt(100));//random generated and printed
			System.out.print(" " + r.nextInt(100));//random generated and printed
			System.out.print(" " + r.nextInt(100));//random generated and printed
			System.out.print(" " + r.nextInt(100));//random generated and printed
			System.out.print(" " + r.nextInt(100));//random generated and printed
		   }
		}
    } 