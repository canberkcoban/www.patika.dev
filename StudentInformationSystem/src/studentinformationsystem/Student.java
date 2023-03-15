package studentinformationsystem;

public class Student {
	String name;
	String classes;
	String stuNo;
	Course course1;
	Course course2;
	Course course3;
	boolean isPass;
	double average;
	
	public Student(String name, String classes, String stuNo, Course course1, Course course2, Course course3) {
		this.name = name;
		this.classes = classes;
		this.stuNo = stuNo;
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
		this.isPass = false;
		this.average = 0.0;
	}
	
	public void addBulkExamNote(int note1, int verbalNote1, int note2, int verbalNote2, int note3, int verbalNote3) {
		if((note1 >= 0 && note1 <= 100) && (verbalNote1 >= 0 && verbalNote1 <= 100)) {
			this.course1.note = note1;
			this.course1.verbalNote = verbalNote1;
		}
		
		if((note2 >= 0 && note2 <= 100) && (verbalNote2 >= 0 && verbalNote2 <= 100)) {
			this.course2.note = note2;
			this.course2.verbalNote = verbalNote2;
		}
		
		if ((note3 >= 0 && note3 <= 100) && (verbalNote3 >= 0 && verbalNote3 <= 100)) {
			this.course3.note = note3;
			this.course3.verbalNote = verbalNote3;
		}
	}
	
	public void calcAverage() {
		this.average = (((this.course1.note * 0.80) + (this.course1.verbalNote * 0.20)) + ((this.course2.note * 0.80) + (this.course2.verbalNote * 0.20)) + (this.course3.note * 0.80) + (this.course3.verbalNote * 0.20)) / 3.0;
	}

	public void isPass() {
		calcAverage();
		
		if(this.average >= 55 & this.average <= 100) {
			System.out.println("Well done! You passed the exam. ");
			this.isPass = true;
		}
		else {
			System.out.println("You didn't pass the exam. Please, take the exam again! ");
		}
	}
	
	
	public void printNote() {
		System.out.println();
		
		System.out.println("Student: " + this.name);
        System.out.println("Course1 name: " + this.course1.name + "Course1 note: " + this.course1.note + "Course1 Verbal note: " + this.course1.verbalNote);
        System.out.println("Course2 name: " + this.course2.name + "Course2 note: " + this.course2.note + "Course2 Verbal note: " + this.course2.verbalNote);
        System.out.println("Course3 name: " + this.course3.name + "Course3 note: " + this.course3.note + "Course3 Verbal note: " + this.course3.verbalNote);
	}
	
	public void printStudentName() {
		System.out.println("The Student name: " + this.name);
	}
	
	
}
