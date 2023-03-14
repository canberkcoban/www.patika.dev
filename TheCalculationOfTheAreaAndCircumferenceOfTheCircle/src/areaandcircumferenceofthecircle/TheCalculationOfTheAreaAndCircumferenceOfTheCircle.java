package areaandcircumferenceofthecircle;

import java.util.Scanner;

public class TheCalculationOfTheAreaAndCircumferenceOfTheCircle {

	public static void main(String[] args) {
		double r, a, area, pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle is: ");
		r = input.nextDouble();
		
		System.out.print("Enter the measure of the center angle: ");
		a = input.nextDouble();
		
		area = ((pi * (r * r) * a) / 360);
		System.out.print("The area of the circle is " + area);

	}

}
