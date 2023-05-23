package myfirstgit;
import java.util.Scanner;
public class DivideTwoNum {
	public static void main (String[] args) {
//		float a = 22;
//		float b = 7;
//		double c = (a/b);
		Scanner s= new Scanner (System.in);
		int a= s.nextInt();
		int b= s.nextInt();
		int c= a/b;
		System.out.println (c);
	}
}
