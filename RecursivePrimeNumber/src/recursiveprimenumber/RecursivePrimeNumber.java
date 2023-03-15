package recursiveprimenumber;

import java.util.Scanner;

public class RecursivePrimeNumber {
	
	static void primeNumber(int prime) {
		int counter = 0;
		for(int i = 1; i <= prime; i++) {
			if(prime % i == 0) {
				counter++;
			}
		}
		if((counter == 2) && (prime >= 2)) {
			System.out.println(prime + " number is a prime number! ");
		}
		else {
			System.out.println(prime + " number is not a prime number! ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("Please enter the number: ");
			int number = input.nextInt();
			
			primeNumber(number);
		}

	}

}
