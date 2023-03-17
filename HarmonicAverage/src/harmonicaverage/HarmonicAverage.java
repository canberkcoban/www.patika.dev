package harmonicaverage;

public class HarmonicAverage {

	public static void main(String[] args) {
		int[] arrayList = {1, 5, 15, 20, 25, 35, 55};
		double harmonicAverage = 0.0;
		
		for(int i = 1; i < arrayList.length; i++) {
			harmonicAverage += i;
		}
		
		double average = arrayList.length / harmonicAverage;
		System.out.println("The harmonic average of the numbers in the sequences: " + harmonicAverage);

	}

}
