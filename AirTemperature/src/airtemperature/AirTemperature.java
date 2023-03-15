package airtemperature;

import java.util.Scanner;

public class AirTemperature {

	public static void main(String[] args) {
		double airtemperature;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Air Temperature: ");
		airtemperature = input.nextDouble();
		
		if (airtemperature > 25) {
			System.out.println("You can swim! ");
		} 
		
		else if (airtemperature >= 15 && airtemperature <= 25) {
			System.out.println("You can do picnic.");
		}
		
		else if (airtemperature >= 5 && airtemperature < 15) {
			System.out.println("You can go cinema.");
		}
		
		else if (airtemperature < 5 ) {
			System.out.println("You can do skiing.");
		}
		
		else {
			System.out.println("If you want you can do different exercises, it's your choice.");
		}
		

	}

}
