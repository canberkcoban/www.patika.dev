package greengrocercashBoxprogram;

import java.util.Scanner;

public class GreengrocerCashBoxProgram {

	public static void main(String[] args) {
		double totalPrice, pear, apple, tomato, banana, eggplant;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many kilograms of pears do you want to buy? ");
		pear = input.nextDouble();
		
		System.out.print("How many kilograms of apples do you want to buy? ");
		apple = input.nextDouble();
		
		System.out.print("How many kilograms of tomatoes do you want to buy? ");
		tomato = input.nextDouble();
		
		System.out.print("How many kilograms of bananas do you want to buy? ");
		banana = input.nextDouble();
		
		System.out.print("How many kilograms of eggplants do you want to buy? ");
		eggplant = input.nextDouble();
		
		totalPrice = pear * 2.14 + apple * 3.67 + tomato * 1.11 + banana * 0.95 + eggplant * 5.00;
		System.out.println("The total price of the market shopping is: " + totalPrice);
		
	}

}
