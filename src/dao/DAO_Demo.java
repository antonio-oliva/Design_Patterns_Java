package dao;

public class DAO_Demo {
	public static void main(String[] args) {
		StudentDAOInterface studentDao = new StudentDAO();

		// Print all students
		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + "]");
		}
		
		System.out.println("");

		// Update student
		Student student = studentDao.getStudent(0);
		student.setName("Michael");
		studentDao.updateStudent(student);

		// get the student
		studentDao.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + "]");
	}
}
