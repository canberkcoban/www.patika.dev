package divisionby2and4;

import java.util.Scanner;

public class DivisionBy2and4 {

	public static void main(String[] args) {
		
			int i, k;
			int count = -1, total = 0;
			double average;
			
			Scanner input = new Scanner(System.in);
			System.out.print("Please, enter the number: ");
			k = input.nextInt();
			
			for(i = 0; i <= k; i++) {
				if((i % 2 == 0) && (i % 4 == 0)) {
					count += 1;
					total += i;
					System.out.println("The even numbers: " + i);
				}
			}
			System.out.println();
			
			average = total / count;
			System.out.println("The amount of numbers divided by 2 and 4: " + count);
			System.out.println("The average of numbers divided by 2 and 4: " + average);
			System.out.println("The sum of the numbers divided by 2 and 4: " + total);
			
		}
}
