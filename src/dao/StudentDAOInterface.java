package dao;

import java.util.ArrayList;

public interface StudentDAOInterface {
	public ArrayList<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);
}
