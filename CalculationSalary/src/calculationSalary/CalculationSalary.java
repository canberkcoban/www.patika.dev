package calculationSalary;

public class CalculationSalary {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Mike", 13752, 45, 2015);
		Employee employee2 = new Employee("Chris", 15752, 57, 2019);
		Employee employee3 = new Employee("Ozcan", 14752, 38, 2017);
		
		employee1.toStringPrintAll();
		System.out.println();
		
		employee2.toStringPrintAll();
		System.out.println();

		employee3.toStringPrintAll();
		System.out.println();

	}

}
