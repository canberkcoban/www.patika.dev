package theSmallestAndLargestNumber;

import java.util.Arrays;
import java.util.Scanner;

public class TheSmallestAndLargestNumber {

	public static void main(String[] args) {
		//Largest kısmında bir sıkıntı var onu incele!
		int number;
		int nearestSmallest = 0;
		int nearestLargest = 0;
		
		int[] arrayList = {15, 12, 788, 1, -1, -778, 2, 0};
		
		Scanner inputNumber = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		number = inputNumber.nextInt();
	
		Arrays.sort(arrayList);
		
		for(int i = 0; i < arrayList.length; i++) {
			if(number < arrayList[i]) {
					nearestLargest = arrayList[i];
					nearestSmallest = arrayList[i - 1];
					break;
				}			
			}
		
		System.out.println("The nearest number that less the entered number: " + nearestSmallest);
		System.out.println("The nearest number that is bigger than the entered number: " + nearestLargest);
		}
	
}
