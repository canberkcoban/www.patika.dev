package hypotenuse;

import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		double a, b, c, u, circumference, area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first edge of the triangle: ");
		a = input.nextDouble();
		
		System.out.print("Enter the second edge of the triangle:");
		b = input.nextDouble();
		
		System.out.print("Enter the third edge of the triangle:");
		c = input.nextDouble();
		
		circumference = (a + b + c);
		u = circumference / 2;
		area = (u * (u - a) * (u - b) * (u - c));
		
		System.out.println("The circumference of the triangle: " + circumference);
		System.out.println("The u of the triangle: " + u);
		System.out.println("The area of the triangle: " + area);
		
		
		
	}

}
