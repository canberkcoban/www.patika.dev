package makingdiamondwithJava;

import java.util.Scanner;

public class MakingDiamondWithJava {

	public static void main(String[] args) {
		  /*
		    *
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
		    *
		    */
		
		int n;	
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of base:  ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
        	
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        for (int i = n - 1; i >= 1 ; i--) {
        	
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
