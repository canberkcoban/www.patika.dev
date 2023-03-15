package primenumber;

public class PrimeNumber {

	public static void main(String[] args) {
		int a, b;

        for (a = 2; a <= 100; a++) {
            int counter = 0;

            for (b = 1; b <= a; b++) {

                if (a % b == 0) {
                    counter++;
                }
            }
            if (counter <= 2) {
                System.out.println(a);
            }
        }
    }

}
