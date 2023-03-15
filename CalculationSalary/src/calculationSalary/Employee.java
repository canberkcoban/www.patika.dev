package calculationSalary;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax() {
		double tax;
		if(this.salary < 1000) {
			return 0;
		}
		else {
			tax = this.salary * 0.03;
			return tax;
		}
		
	}
	
	public double bonus() {
		if(this.workHours < 40) {
			return 0;
		}
		else {
			salary = (workHours - 40) * 30;
			return salary;
		}
	}
	
	public double raiseSalary() {
		int year = 2021;
		int workYears = year - this.hireYear;
		double raiseSalary = 1.0;
		if(workYears > 19) {
			raiseSalary = salary * 0.15;
		}
		
		else if(workYears > 9 && workYears < 20) {
			raiseSalary = salary * 0.10;		
		}
		
		else {
			raiseSalary = salary * 0.05;		
		}
		
		return raiseSalary;
	}
	
	public void taxAndBonus() {
		double taxAndBonus;
		taxAndBonus = this.salary + this.bonus() - this.tax();
		System.out.println("Your salary along with taxes and bonuses: " + taxAndBonus);
	}
	
	public void totalSalary() {
		double totalSalary;
		totalSalary = this.salary + this.raiseSalary();
		System.out.println("Your total salary: " + totalSalary);
	}
	
	public void toStringPrintAll() {
		System.out.println("Your name: " + this.name);
		System.out.println("Your salary: " + this.salary);
		System.out.println("Work hours: " + this.workHours);
		System.out.println("Your hiring year: " + this.hireYear);
		System.out.println("Your tax: " + this.tax());
		System.out.println("Your bonus: " + this.bonus());
		System.out.println("Your raise salary: " + this.raiseSalary());
	}
	
}
