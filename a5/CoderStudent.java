package a5;
//Assignment 4
class Student{
	public int studId ;
	public String studName;
	public String courseName;
	public static int COUNT;
	public Student(int studId, String studName, String courseName) {
//		super();
		COUNT++;
		this.studId = COUNT;
		this.studName = studName;
		this.courseName = courseName;
		
	}
	@Override
	public String toString() {
		return "Student details => [studId= CS" + studId + ", studName=" + studName + ", courseName=" + courseName +"]";
	}
	
}
public class CoderStudent{
	public static void main(String[] args) {
		Student  s1 = new Student(Student.COUNT,"sameer","Java"); 
		Student s2 = new Student(Student.COUNT,"zahid","Python");
		Student s3 = new Student(Student.COUNT,"Rahul",".NET");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	}
}