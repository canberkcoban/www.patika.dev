package findingFrequencyInTheArrays;

import java.util.Arrays;

public class FindingFrequencyInTheArrays {

	public static void main(String[] args) {	
		int[] arrayList = {10, 20, 20, 10, 10, 20, 5, 20};
		System.out.println("The Array: " + Arrays.toString(arrayList));
		
		Arrays.sort(arrayList);
		System.out.println("The sorting in the array: " + Arrays.toString(arrayList));
		
		int counter = 1;
		
		for(int i = 0; i < arrayList.length; i++) {
			if(i == 0) {
				for(int j = 0; j < arrayList.length; j++) {
				if((i != j) && (arrayList[i] == arrayList[j])) {
					counter++;
				}
			}
				System.out.println("It repeated the number " + arrayList[i] + ", " + counter + " times in the series!");
		}
			else if(arrayList[i] != arrayList[i - 1]){
				for(int j = 0; j < arrayList.length; j++) {
					if((i != j) && (arrayList[i] == arrayList[j])) {
						counter++;
					}
				}
				System.out.println("It repeated the number " + arrayList[i] + ", " + counter + " times in the series!");
			}
		counter = 1;
	}

}
}
