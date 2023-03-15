package ebobekok;

import java.util.Scanner;

public class EBOBEKOK {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of n1: ");
		int n1 = input.nextInt();
		
		System.out.print("Enter the number of n2: ");
		int n2 = input.nextInt();
		
		System.out.println("The Greatest Common Divisor(GCD - EBOB) with while loop: ");

		int gcd = 1;
		int i = 1;
		while(i  <= n1) {
			if(n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
			i++;
		}
		
		System.out.println("The Greatest Common Divisor is: " + gcd);
		System.out.println();
		
		System.out.println("The Least Common Multiple(LCM - EKOK) with while loop: ");
		
		int lcm = 1;
		int j = 1;
		while(j <= (n1 * n2)) {
			if(j % n1 == 0 && j % n2 == 0) {
				lcm = j;
				break;
			}
			j++;
		}
		
		System.out.println("The Least Common Multiple(LCM - EKOK) is: " + lcm);	
	}
	
	
}

