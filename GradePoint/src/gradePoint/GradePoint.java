package gradePoint;

import java.util.Scanner;

public class GradePoint {

	public static void main(String[] args) {
		double math, physics, chemistry, turkish, history, music;
		int numberOfLessons = 5;

		Scanner gpa = new Scanner(System.in);
		
		System.out.print("Your Math Grade: ");
		math = gpa.nextDouble();
		if(math < 0 || math > 100) {
			math = 0;
			numberOfLessons--;
		}
		
		
		System.out.print("Your Physics Grade: ");
		physics = gpa.nextDouble();
		if(physics < 0 || physics > 100) {
			physics = 0;
			numberOfLessons--;
		}
		
		System.out.print("Your Chemistry Grade: ");
		chemistry = gpa.nextDouble();
		if(chemistry < 0 || chemistry > 100) {
			chemistry = 0;
			numberOfLessons--;
		}
		
		System.out.print("Your Turkish Grade: ");
		turkish = gpa.nextDouble();
		if(turkish < 0 || turkish > 100) {
			turkish = 0;
			numberOfLessons--;
		}
		
		System.out.print("Your Music Grade: ");
		music = gpa.nextDouble();
		if(music < 0 || music > 100) {
			music = 0;
			numberOfLessons--;
		}
		
		double total = (math + physics + chemistry + turkish + music);
		
		double average = total / numberOfLessons;

		System.out.println("Your Average Grade is: " + average);
		
		boolean condition = average > 55;
		
		String result = condition ? "You passed the exam!" : "You didn't pass the exam!";
		
		System.out.println(result);
		

	}
}
