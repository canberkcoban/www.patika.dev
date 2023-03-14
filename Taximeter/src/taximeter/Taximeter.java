package taximeter;

import java.util.Scanner;

public class Taximeter {

	public static void main(String[] args) {
		int km, openingFee = 10;
		double perkmPrice = 2.20, price, total;
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter the distance in kilometers: ");
		km = inputScanner.nextInt();
		
		total = openingFee + (perkmPrice * km);
		total = (total < 20) ? 20 : total;
		System.out.print("The total taximeter price is: " + total);
		
		

	}

}
