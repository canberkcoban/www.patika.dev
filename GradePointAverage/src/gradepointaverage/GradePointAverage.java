package gradepointaverage;

import java.util.Scanner;

public class GradePointAverage {

	public static void main(String[] args) {
		int math, physics, chemistry, turkish, history, music;
		
		Scanner gpa = new Scanner(System.in);
		
		System.out.print("Your Math Grade: ");
		math = gpa.nextInt();
		
		System.out.print("Your Physics Grade: ");
		physics = gpa.nextInt();
		
		System.out.print("Your Chemistry Grade: ");
		chemistry = gpa.nextInt();
		
		System.out.print("Your Turkish Grade: ");
		turkish = gpa.nextInt();
		
		System.out.print("Your History Grade: ");
		history = gpa.nextInt();
		
		System.out.print("Your Music Grade: ");
		music = gpa.nextInt();
		
		int total = (math + physics + chemistry + turkish + history + music);
		
		double average = total / 6.0;

		System.out.println("Your Average Grade is: " + average);
		
		boolean condition = average > 60;
		
		String result = condition ? "You passed the exam!" : "You didn't pass the exam!";
		
		System.out.println(result);
		

	}

}
