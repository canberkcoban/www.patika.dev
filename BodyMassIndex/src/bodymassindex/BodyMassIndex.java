package bodymassindex;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		double weight, height, bodymassindex;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your height in meters: ");
		height = input.nextDouble();
		
		System.out.print("Please enter your weight in kilogram: ");
		weight = input.nextDouble();
		
		bodymassindex = (weight / (height * height));
		System.out.println("The Your Body Mass Index is: " + bodymassindex);
	
	}

}
