package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int total, x = 0, y = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int count = input.nextInt();
		
		for(int i = 1; i <= count; i++) {
			System.out.println("The Fibonacci series are respectively like that: " + x);
			total = x + y;
			x = y;
			y = total;
		}
	
	}

}
