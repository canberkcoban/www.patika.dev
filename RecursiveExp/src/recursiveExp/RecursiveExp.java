package recursiveExp;

import java.util.Scanner;

public class RecursiveExp {
	
	static int power(int base, int exp) {
		int result = 1;
		for(int i = 1; i <= exp; i++) {
			result *= base;
		}
		if((base == 0) && (exp == 0)) {
			System.out.println("It cannot be both zero! You need the enter different base and exp values. ");
		}
		else {
			System.out.println("The result is: " + result);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("Please enter the base value: ");
			int base = input.nextInt();
			System.out.print("Please enter the exp value: ");
			int exp = input.nextInt();
			
			power(base, exp);
		}
	}

}
