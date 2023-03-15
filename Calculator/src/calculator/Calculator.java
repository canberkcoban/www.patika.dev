package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) { 
		int n1, n2, select;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		n1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		n2 = input.nextInt();

		System.out.println(" 1 - Addition\n 2 - Subtraction\n 3 - Multiplication\n 4 - Division ");
		System.out.print("What is your choice? ");
		select = input.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("The sum of the first and second numbers: " + (n1 + n2));
			break;
			
		case 2:
			System.out.println("The subtraction of the first and second numbers: " + (n1 - n2));
			break;
		
		case 3:
			System.out.println("The multiplication of the first and second numbers: " + (n1 * n2));
			break;

		case 4:
			switch (n2) {
				case 0:
					System.out.println("N2 value cannot be zero! You can't divide a number by 0.");
					break;
				default:
				System.out.println("The division of the first and second numbers: " + (n1 / n2));
				break;
			}	

		default:
			System.out.println("Try again!");
			break;
		}
	}

}
