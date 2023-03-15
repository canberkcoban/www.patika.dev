package palindromicnumber;

import java.util.Scanner;

public class PalindromicNumber {
	
	static boolean isPalindromic(int number) {
		int temp = number, reverseNumber = 0, lastNumber;
		while(temp != 0) {
			System.out.println("Number ==> " + temp);
			lastNumber = temp % 10;
			System.out.println("The last number of digits is: " + lastNumber);
			
			reverseNumber = (reverseNumber * 10) + lastNumber;
			System.out.println("The new number is: " + reverseNumber);
			temp /= 10;
			System.out.println("The new temp number is: " + temp);
			System.out.println();
		}
		
		if (number == reverseNumber) {
		return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		int x;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the new number: ");
		x = input.nextInt();
		
		if (isPalindromic(x))
			{
			System.out.println(x + " is a palindromic number! ");
			}
        else 
        	{
        	System.out.println(x + " is not a palindromic number! ");
        	}
	}
}
