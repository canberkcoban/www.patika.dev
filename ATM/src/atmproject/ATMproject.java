package atmproject;

import java.util.Scanner;

public class ATMproject {

	public static void main(String[] args) {
		String userName, password;
		Scanner input = new Scanner(System.in);
		int select;
		int right = 3;
		int balance = 2000;
		
		while(right > 0) {
		System.out.print("Enter the your username: ");
		userName = input.nextLine();
		System.out.print("Enter the your password: ");
		password = input.nextLine();
		
		if(userName.equals("canberk123") && password.equals("123canberk")) {
			System.out.println("Well done! Successfully entered.");
			do {
				System.out.println("1 - Deposit Money,\r\n"
						+ "2 - Withdrawal of Money,\r\n"
						+ "3 - Balance Inquiry,\r\n"
						+ "4 - Log out ");
				System.out.print("Please select the operation you want to perform: ");
				select = input.nextInt();
				
				switch(select) {
					case 1:
						System.out.print("Money Amount: ");
						int price = input.nextInt();
						balance += price;
						break;
			
					case 2:
						System.out.print("Money Amount: ");
						int price1 = input.nextInt();
				
						if (price1 > balance){
						System.out.println("The balance is insufficient. Check your balance! ");
				} else {
					balance -= price1;
				}
						break;
					
					case 3:
						System.out.println("Your Balance is: " + balance);
						break;
						
					case 4:
						System.out.println("Logging out! ");	
						break;
				}
			} while(select != 4);
			System.out.println("See you later. Take care of yourselves! ");
		}
		else {
			right--;
			System.out.println("You've entered wrongly. Please check out your username or password. Later Try again! ");
			System.out.println("Your remaining right to try: " + right);
		}
		
		
	}
	
}

}