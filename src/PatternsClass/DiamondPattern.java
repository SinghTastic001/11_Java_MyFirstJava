package PatternsClass;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		
		System.out.println("Enter odd number of rows: ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		
		if(rows%2==0) {
			System.out.print("Enter even number");
			System.exit(0);
		}
		
		int upper = (rows/2)+1;
		for(int i=1; i<=upper; i++) {
			for(int k=1; k<=upper-i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		int lower = (rows/2);
		
		
		for(int i=1; i<=lower; i++) {
			
			for(int k=1; k<=i; k++) {
				System.out.print(" ");
			}
			for(int j=i; j<=lower; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
