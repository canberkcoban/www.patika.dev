package calculatingThePriceOfPlaneTickets;

import java.util.Scanner;

public class CalculatingThePriceOfPlaneTickets {
	public static void main(String[] args) {
        int distance, age, typeofTrip;
        int totalAmount, ageDiscount, percantageofageDiscount = 0, discountAmount, roundtripticketDiscount;
		double normalAmount, perKm = 0.10;
        
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance you will travel: ");
        distance = input.nextInt();
        while (distance <= 0) {
            System.out.print("You entered incorrect distance information, so please enter the information again. ");
            distance = input.nextInt();
        }

        System.out.print("How old are you? ");
        age = input.nextInt();
        while (age <= 0) {
            System.out.print("You entered incorrect age information, so please enter the information again. ");
            age = input.nextInt();
        }

        System.out.print("What is your travelling type ?\nOne Way Trip(Press 1) or  Round Trip(Press 2): ");
        typeofTrip = input.nextInt();
        while((typeofTrip != 1) && (typeofTrip != 2)) {
            System.out.println("The trip type can only take the value 1 or 2. ");
            System.out.print("Please select your travel type again. (1 -> One way 2 -> Round Trip) ");
            typeofTrip = input.nextInt();
        }
        
        normalAmount = distance * perKm;
        ageDiscount = (int) (normalAmount * percantageofageDiscount);
        discountAmount = (int) (normalAmount - ageDiscount);
        roundtripticketDiscount = (int) (discountAmount * 0.20);

        if (distance > 0 && age > 0 && typeofTrip == 1) {
        	if (age > 65) {
        		int discountAmount1 =  (int) (normalAmount * 0.30);
        		int newTotal = (int) (normalAmount - discountAmount1);
        		System.out.println("Total price is: " + newTotal);
        	}
        	
        	else if (age >= 12 && age <= 24) {
					ageDiscount = (int) (normalAmount * 0.10);
					totalAmount = (int) (normalAmount - ageDiscount);
					System.out.println("Total price is: " + totalAmount);
        	}
					
			else if (age < 12 && age > 0) {
				normalAmount = normalAmount * 0.5;
				System.out.println("Total price is: " + normalAmount);
			}
        	
			else {
				System.out.println("Total price is: " + normalAmount);
			}
        }
        	
    	else if (distance > 0 && age > 0 && typeofTrip == 2) {
        	if (age > 65) {
        		int discountAmount1 =  (int) (normalAmount * 0.30);
        		int discountAmount2 = (int) ((normalAmount - discountAmount1) * 0.20);
        		int newTotal = (int) (normalAmount - discountAmount2) * 2;
        		System.out.println("Total price is: " + newTotal);
        	}
        	
        	else if (age >= 12 && age <= 24) {
					ageDiscount = (int) (normalAmount * 0.10);
					int discount2 = (int) ((normalAmount - ageDiscount) * 0.20);
					totalAmount = (int) (normalAmount - discount2 - ageDiscount) * 2;
					System.out.println("Total price is: " + totalAmount);
        	}
					
			else if (age < 12 && age > 0) {
				double oldageDiscount = normalAmount * 0.5;
				int discount1 = (int) ((normalAmount - oldageDiscount) * 0.20) * 2;
				System.out.println("Total price is: " + discount1);
			}
        	
			else {
				normalAmount = normalAmount * 2;
				System.out.println("Total price is: " + normalAmount);
			}
    		
		}
    	else {
    		System.out.println("You entered incorrect data. Please enter the correct data!");
			
		} 

    }
}

