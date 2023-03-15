package studentinformationsystem;

public class Course {
	Teacher courseTeacher;
	String name;
	int code;
	String prefix;
	int note;
	int verbalNote;
	
	public Course(String name, int code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		int note = 0;
		int verbalNote = 0;
}
	public void addTeacher(Teacher courseTeacher) {
		if(courseTeacher.branch.equals(this.prefix)) {
			this.courseTeacher = courseTeacher;
			System.out.println("The lessons and teachers are match up! ");
		}
		else {
			System.out.println("The lessons and teachers are not match up! ");
		}
	}
	
	public void printcourseTeacher() {
		this.courseTeacher.print();
	}
	
}