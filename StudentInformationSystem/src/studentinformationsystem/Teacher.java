package studentinformationsystem;

public class Teacher {
	String name;
	String mpno;
	String branch;
	
	public Teacher(String name, String mpno, String branch) {
		this.name = name;
		this.mpno = mpno;
		this.branch = branch;
	}
	
	public void print() {
		System.out.println("The Teacher name is: " + this.name);
		System.out.println("The Teacher department is: " + this.branch);
		System.out.println("The Teacher phone number is: " + this.mpno);
	}
}
