package usernameandpassword;

import java.util.Scanner;

public class UsernameAndPassword {

	public static void main(String[] args) {
		String username, password, resetPassword, newPassword;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please, enter the your username: ");
		username = input.nextLine();
		
		System.out.print("Please, enter the your password: ");
		password = input.nextLine();
		
		if(username.equals("canberktesting") && password.equals("javatesting")) {
			System.out.println("You have successful logged in.");
		}
		else if (username.equals("canberktesting") && !password.equals("javatesting")) {
			System.out.println("Wrong password. If you forget your password, reset your password.");
			System.out.println("Do you want to reset your password? Choose one (Yes or No) ");
			resetPassword = input.nextLine();
			if (resetPassword.equals("Yes")) {
				System.out.println("Enter the new password: ");
				newPassword = input.nextLine();
				
				while (newPassword.equals(password) || newPassword.equals("javatesting")) {
					System.out.println("The password could not be created, please enter another password: ");
					newPassword = input.nextLine();
				}
				password = newPassword;
				System.out.println("Your new password is created successfully!");
			}
				
			else if (resetPassword.equals("No")) {
				System.out.println("You didn't prefer to reset your password! ");

				}
			else {
				System.out.println("Wrong choice!");
			}
					
			} else {
				System.out.println("Please check your user name information! ");
			}
			
		}
	
	}
