package advancedcalculator;

import java.util.Scanner;

public class AdvancedCalculator {
	
	static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        
        while (true) {
            System.out.print(i++ + ". number:");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("The result is: " + result);
    }
	
	static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter?: ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number: ");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("The result is: " + result);
    }
	
	 static void times() {
	        Scanner scan = new Scanner(System.in);
	        int number, result = 1, i = 1;

	        while (true) {
	            System.out.print(i++ + ". number: ");
	            number = scan.nextInt();

	            if (number == 1)
	                break;

	            if (number == 0) {
	                result = 0;
	                break;
	            }
	            result *= number;
	        }

	        System.out.println("The result is: " + result);
	    }
	 
	 static void divided() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("How many numbers do you want to enter?: ");
	        int counter = scan.nextInt();
	        double number, result = 0.0;

	        for (int i = 1; i <= counter; i++) {
	            System.out.print(i + ". sayı :");
	            number = scan.nextDouble();
	            if (i != 1 && number == 0) {
	                System.out.println("You cannot divide by 0! ");
	                continue;
	            }
	            if (i == 1) {
	                result = number;
	                continue;
	            }
	            result /= number;
	        }

	        System.out.println("The result is: " + result);
	    }
	 
	 static void power() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Please enter the base value: ");
	        int base = scan.nextInt();
	        System.out.print("Please enter the exponent value: ");
	        int exponent = scan.nextInt();
	        int result = 1;

	        for (int i = 1; i <= exponent; i++) {
	            result *= base;
	        }

	        System.out.println("Sonuç : " + result);
	    }

	    static void factorial() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Please enter the number::");
	        int n = scan.nextInt();
	        int result = 1;

	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }

	        System.out.println("The result is: " + result);
	    }
	    
	    static void mode() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Please enter the first number: ");
	        int fNumber =  scan.nextInt();
	        System.out.print("Please enter the second number: ");
	        int sNumber = scan.nextInt();
	        
	        int mode = fNumber % sNumber;
	        System.out.println("The result is: " + mode);
	        
	    }
	    
	    static void areaandperimeter() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Please enter the long edge of the rectangle: ");
	        int ledgeRectangle = scan.nextInt();
	        System.out.print("Please enter the short edge of the rectangle");
	        int sedgeRectanlge = scan.nextInt();
	        
	        int rectangleArea = ledgeRectangle * sedgeRectanlge;
	        int rectanglePerimeter = (2 * (ledgeRectangle + sedgeRectanlge));
	        
	        System.out.println("The area of the rectangle is: " + rectangleArea);
	        System.out.println("The perimeter of the rectangle is: " + rectanglePerimeter);
	        
	    }

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
	        int select;
	        String menu = 
	        		  "1- Addition Operation\n"
	                + "2- Subtraction Operation\n"
	                + "3- Multiplication Operation\n"
	                + "4- Division operation\n"
	                + "5- Exponential Number Calculation\n"
	                + "6- Factorial Calculation\n"
	                + "7- Calculating the Mode\n"
	                + "8- The calculation of Rectangular Area and Rectangular Perimeter.\n"
	                + "0- Logging out!";
	        
	        do {
	            System.out.println(menu);
	            System.out.print("Please, select one of the operations: ");
	            select = scan.nextInt();
	            switch (select) {
	                case 1:
	                    plus();
	                    break;
	                case 2:
	                    minus();
	                    break;
	                case 3:
	                    times();
	                    break;
	                case 4:
	                    divided();
	                    break;
	                case 5:
	                    power();
	                    break;
	                case 6:
	                    factorial();
	                    break;
	                case 7:
	                	mode();
	                	break;
	                case 8:
	                	areaandperimeter();
	                	break;
	                case 0:
	                    break;
	                default:
	                    System.out.println("You've entered the wrong information. Please try again! ");
	            }
	        } while (select != 0);

	}

}
