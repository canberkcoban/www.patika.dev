package methodpattern;

import java.util.Scanner;

public class MethodPattern {
	
	static void pattern(int method) {
		System.out.print(method + "|");
		if(method <= 0) {
			return;
		}
		else {
			pattern(method - 5);
			System.out.print(method + "|");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("The number of A is: ");
		int a = input.nextInt();
		System.out.print("The result is: ");
		pattern(a);
	
	}

}
