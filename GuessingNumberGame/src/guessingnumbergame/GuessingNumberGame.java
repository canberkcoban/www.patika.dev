package guessingnumbergame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(100);
		
		Scanner input = new Scanner(System.in);
		
		int right = 0;
		int selected;
		int[] wrong = new int[5]; 
		
		boolean isWin = false;
		boolean isWrong = false;
		
		System.out.println(number);
		
		while(right < 5) {
			System.out.print("Please, enter the your estimation: ");
			selected = input.nextInt();
			
			if(selected < 0 || selected > 99) {
				System.out.print("Please enter the number between 0 and 100!");
				if(isWrong) {
					right++;
					System.out.println("You have made too many incorrect entries. Your remaining right: " + (5 - right));
				}
				else {
					isWrong = true;
					System.out.println("Your right to try will be reduced with each incorrect entry! ");
				}
				continue;
			}
			
			if(selected == number) {
				System.out.print("Well done! Your estimation is true!\nYour estimation is " + number);
				isWin = true;
				break;
			}
			else {				
				System.out.print("You've entered the wrong information! Please enter true information!\n");
				if(selected > number) {
					System.out.println("The " + selected + " number is greater than the random number!");
				}
				else {
					System.out.println("The " + selected + " number is less than the random number!");
				}
				wrong[right++] = selected;
				System.out.println("Your remaining right: " + (5 - right));
			}
			
		}
		
		if(!isWin) {
			System.out.println("You lost! Try again!");
			System.out.println("Your estimation: " + Arrays.toString(wrong));
		}
				
	}

}
