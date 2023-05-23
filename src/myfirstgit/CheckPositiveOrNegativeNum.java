package myfirstgit;
import java.util.Scanner;
public class CheckPositiveOrNegativeNum {

	

 
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = s.nextInt();

	        if (number > 0) {
	            System.out.println("The number is positive.");
	        } else if (number < 0) {
	            System.out.println("The number is negative.");
	        }
	         else {
	            System.out.println("The number is zero.");
	        }

	      
	    }
	}

 
	
	

