package chineseZodiac;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		int birthDate;
		Scanner zodiac = new Scanner(System.in);
		System.out.print("What is your date of birth in terms of year? ");
		birthDate = zodiac.nextInt();
		
		if(birthDate % 12 == 0) {
			System.out.println("Monkey");
		}
		
		else if (birthDate % 12 == 1) {
			System.out.println("Rooster");
		}
		
		else if (birthDate % 12 == 2) {
			System.out.println("Dog");
		}
		
		else if (birthDate % 12 == 3) {
			System.out.println("Pig");
		}
		
		else if (birthDate % 12 == 4) {
			System.out.println("Mouse");
		}
		
		else if (birthDate % 12 == 5) {
			System.out.println("Ox");
		}
		
		else if (birthDate % 12 == 6) {
			System.out.println("Tiger");
		}
		
		else if (birthDate % 12 == 7) {
			System.out.println("Rabbit");
		}
		
		else if (birthDate % 12 == 8) {
			System.out.println("Dragon");
		}
		
		else if (birthDate % 12 == 9) {
			System.out.println("Snake");
		}
		
		else if (birthDate % 12 == 10) {
			System.out.println("Horse");
		}
		
		else if (birthDate % 12 == 11) {
			System.out.println("Sheep");
		}
		
		else {
			System.out.println("Try again! You've entered the wrong information! ");
		}
	}

}
