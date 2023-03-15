package Divisionby3and4;

import java.util.Scanner;

public class Divisionby3and4 {

	public static void main(String[] args) {
		int i, k;
		int count = -1, total = 0;
		double average;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please, enter the number: ");
		k = input.nextInt();
		
		for(i = 0; i <= k; i++) {
			if((i % 3 == 0) && (i % 4 == 0)) {
				count += 1;
				total += i;
				System.out.println(i);
			}
		}
		
		average = total / count;
		System.out.println("The average remaining from the section of the entered number to 3 and 4 is: " + average);
		
	}

}
