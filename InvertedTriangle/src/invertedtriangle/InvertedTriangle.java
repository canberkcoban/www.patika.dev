package invertedtriangle;

import java.util.Scanner;

public class InvertedTriangle {

	public static void main(String[] args) {
		int number;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		number = input.nextInt();
		
		for(int i = number; i >= 1; i--) {
			for(int j = number - i; j >= 1; j--) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}


}
