import java.util.*;

/*
/*
Author: David Amparan
Instructor: Ceberio, Martine
TA: Angel Garcia, Raquel Gonzalez, Kevin Parker
Last Modified: 2/24/2018
Functionality: With the introduction of methods in lecture, we are now applying these as you can see.
An orignal file was given that performs all operations but all these reside within the main
method which we do not want. Therefore we must implement methods to do these functions.  
*/
public class lab6WithMethods {

    /* Example: promptUserForName() is given to you
     **/
    public static String promptUserForName() {
        System.out.println("What is your name?");
        Scanner in = new Scanner(System.in);
        return in.next();   
    }
    
    /* Here is the signature of the method called greetUser:
     ** Complete its body
     **/
    public static void greetUser(String message, String user) {
        System.out.println( message+ " " + user + "!" );
    }
    
    public static int promptUserForAge(){
		System.out.println("What is your age?");
		Scanner in = new Scanner(System.in);
			int age = in.nextInt();
		return age;
	}

    /* Here: Design the method called guessGradeLevel */
	public static void guessGradeLevel(int age){
		if (age < 5){
			System.out.println("You are still too young too worry about school!");
		}
		else if (age == 5){
			System.out.println("You are probably a Kindergartner student!");
		}
		else if (age >= 6 && age < 18){
			System.out.println("You are a " + (age - 5) + " grade student."); 
	    }
		else {
			System.out.println("You are ready for college!");
		}
	}
    /* Here: Design the method called promptUserFor */
	public static double promptUserFor(String userAttr){
			System.out.println("What is your " + userAttr + ".");
			Scanner in = new Scanner(System.in);
				double userPhys = in.nextDouble();
			return  userPhys;
	}
		
	
    
    /* Here: Design the method called computeBMI */
	public static double computeBMI (double userW, double userH){
		double BMI = userW / (userH * userH);
		
		return BMI;
	}
	

    /* Here: Design the method called printBMIRelevantMessage */
    public static void printBMIRelevantMessage(double userBMI){
		if ( userBMI < 18.5){
			System.out.println("You are underweight.");
		}
		else if (userBMI < 25){
			System.out.println("Your weight is fine.");
		}
		else if (userBMI < 30){
			System.out.println("You are overweight.");
		}
		else {
			System.out.println("Your weight puts you in the obese range.");
		}
	}
    /**************************************************************************************************
     ** The new and improved main method: it reads much more easily than the one from lab6Original.java
     ** However, you need to write the method signatures and bodies corresponding to each of the method 
     ** calls you see in the main method
     **/
    public static void main(String[] args) {
        String name = promptUserForName();
        greetUser("Welcome", name);
        
        int age = promptUserForAge();
        guessGradeLevel(age);
        
        double weight = promptUserFor("weight");
        double height = promptUserFor("height");
        double BMI = computeBMI(weight, height);
        printBMIRelevantMessage(BMI);
        
        greetUser("Good bye", name); 
    }
    
}