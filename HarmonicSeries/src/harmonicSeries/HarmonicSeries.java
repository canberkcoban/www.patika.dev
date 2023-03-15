package harmonicSeries;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		int n;
		double total = 0;
		
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.print("Please enter the 'n' numbers: ");
		n = inputNumber.nextInt();
		
		for(double i = 1; i <= n; i++) {
			total += 1 / i;
			System.out.println("The total result, respectively: " + total);
		}
		
		System.out.println("The result is: " + total);
	
	}

}
