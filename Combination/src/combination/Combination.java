package combination;

import java.util.Iterator;
import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		
		//Formula of Combination: C(n,r) = n! / (r! * (n-r)!)
        
		int n, r, combinationN = 1, combinationR = 1, total = 1, result;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of n: ");
		n = input.nextInt();
		
		System.out.print("Enter the number of r: ");
		r = input.nextInt();
		
		for(int i = 1; i <= (n - r); i++) {
			total *= i;
		}
		
		for(int j = 1; j <= n; j++) {
			combinationN *= j;
		}

		for(int k = 1; k <= r; k++) {
			combinationR *= k;
		}
		
		result = combinationN / (combinationR * total);
		System.out.println("The combination spelling is like that: C(" + n + "," + r + ")" + " = " + result);
	}

}
