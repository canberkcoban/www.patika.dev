package powersof4and5;

import java.util.Scanner;

public class PowersOf4And5 {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please, enter the number: ");
		n = input.nextInt();
		
		if(n < 0) {
			System.out.print("Please, enter the positive integer number: ");
			n = input.nextInt();
		}
		
		for (int i = 1, j = 1; i <= n && j <= n; i *= 4, j *= 5) {
			System.out.println("The Multiple of 4: " + i);
			System.out.println("The Multiple of 5: " + j);
		}

	}

}
