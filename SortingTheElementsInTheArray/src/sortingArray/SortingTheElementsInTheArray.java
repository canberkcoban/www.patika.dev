package sortingArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortingTheElementsInTheArray {

	public static void main(String[] args) {
		int number;
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.print("Please, enter the number of elements in the array: ");
		number = inputNumber.nextInt();
		
		int[] arrayList = new int[number];
		
		System.out.println("Please, enter the elements in the arrays: ");
		
		for(int i = 0; i < number; i++) {
			System.out.print((i + 1) + ". number: ");
			arrayList[i] = inputNumber.nextInt();
		}
		
		Arrays.sort(arrayList);
		System.out.print("Sorting elements in the array: ");
		for(int i = 0; i < number; i++) {
			System.out.print(arrayList[i] + " ");
		}

	}

}
