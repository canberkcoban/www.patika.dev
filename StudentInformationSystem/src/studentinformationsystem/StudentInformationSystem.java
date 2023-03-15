package studentinformationsystem;

public class StudentInformationSystem {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher("Ozcan ", "12345678", "HST");
		Teacher teacher2 = new Teacher("Burak ", "13245678", "PHY");
		Teacher teacher3 = new Teacher("Belma ", "14345678", "CHM");
		
		Course history = new Course("History", 101, "HST");
		history.addTeacher(teacher1);
		
		Course physics = new Course("Physics", 102, "PHY");
		history.addTeacher(teacher2);
		
		Course chemistry = new Course("Chemistry", 103, "CHM");
		history.addTeacher(teacher3);
		
		Student student1 = new Student("Rıza ", "123", "3", history, physics, chemistry);
		student1.addBulkExamNote(100, 100, 40, 100, 30, 90);
		student1.isPass();
		
		Student student2 = new Student("Mike ", "123", "3", history, physics, chemistry);
		student2.addBulkExamNote(70, 85, 60, 100, 20, 100);
		student2.isPass();
		
		Student student3 = new Student("Mike ", "123", "3", history, physics, chemistry);
		student3.addBulkExamNote(40, 85, 60, 100, 20, 100);
		student3.isPass();
		

	}

}
