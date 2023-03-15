package maxandminvalue;

import java.util.Scanner;

public class MaxAndMinValue {

	public static void main(String[] args) {			
		int count, number;
		int greatestNumber = 0, leastNumber = 0;	
		
		Scanner amount = new Scanner(System.in);
		System.out.print("How many numbers would you like to enter? ");
		count = amount.nextInt();
		
		for(int i = 1; i <= count; i++) {
			System.out.print("Enter " + i + ". number: ");
			number = amount.nextInt();
			
			if(i == 1) {
				greatestNumber = number;
				leastNumber = number;;
			}
			
			else if(number > greatestNumber) {
				greatestNumber = number;
			}
			
			else {
				leastNumber = number;
			}
		}
		System.out.println("The greatest number is: " + greatestNumber);
		System.out.println("The least number is: " + leastNumber);

	}	 
	
}
