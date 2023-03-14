package kdv;

import java.util.Scanner;

public class KDV {

	public static void main(String[] args) {
		double vatfreePrice, percantageofVat, totalofVat, thepricewithVat;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Price: ");
		vatfreePrice = input.nextDouble();
		
		percantageofVat = (vatfreePrice >= 0 ) && (vatfreePrice <= 1000) ? 0.18 : 0.08;
		
		totalofVat = vatfreePrice * percantageofVat;
		thepricewithVat = vatfreePrice + totalofVat;
		
		System.out.println("Vat Free with Price : " + vatfreePrice);
        System.out.println("The Percantage of Vat: " + percantageofVat);
        System.out.println("The Total of Vat: " + totalofVat);
        System.out.println("The Price with Vat: " + thepricewithVat);
		

	}

}
