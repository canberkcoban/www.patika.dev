package thesumofthedigitnumbers;

import java.util.Scanner;

public class TheSumOfTheDigitNumbers {

	public static void main(String[] args) {
		int number, total = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please, enter the number: ");
		number = input.nextInt();
		
		while(number != 0) {
			total += (number % 10);
			number /= 10;
			System.out.println("It takes place as follows: " + number);
		}
		
		System.out.println("The Sum of the Digit Numbers: " + total);

	}

}
