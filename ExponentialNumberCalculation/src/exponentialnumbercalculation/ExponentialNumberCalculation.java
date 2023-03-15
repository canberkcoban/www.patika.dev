package exponentialnumbercalculation;

import java.util.Scanner;

public class ExponentialNumberCalculation {

	public static void main(String[] args) {
		int base, power;
		int total = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of base: ");
		base = input.nextInt();
		
		System.out.print("Enter the number of power: ");
		power = input.nextInt();
		
		for(int i = 1; i <= power; i++) {
			total *= base;
			System.out.println(total);
		}
		System.out.println("The total result is:  " + total);
	}

}
