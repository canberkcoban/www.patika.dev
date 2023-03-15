package findingRepeatingEvenNumbers;

import java.util.Arrays;

public class FindingRepeatingEvenNumbers {
	
	public static boolean isFind(int arrayList[], int value) {
		for(int i: arrayList) {
			if(i == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arrayList = {3, 7, 3, 2, 1, 4, 21, 1, 7, 9, 8, 2, 7, 99, 33, 11, 17, 23, 99, 8, 7, 33, 17, 11, 1, 3, 4};
		System.out.println(Arrays.toString(arrayList));
		int[] duplicate = new int[arrayList.length];
		
		int startIndex = 0;
		for(int i = 0; i < arrayList.length; i++) {
			for(int j = 0; j < arrayList.length; j++) {
				if((i != j) && (arrayList[i] == arrayList[j]) && (arrayList[i] % 2 == 0)) {
					if(!isFind(duplicate, arrayList[i])) {
						duplicate[startIndex++] = arrayList[i];
					}
					break;
				}
			}
		}
		
		for(int value: duplicate) {
			if(value != 0) {
				System.out.println("The repeating even numbers are: " + value);
			}
		}

	}
	

}
