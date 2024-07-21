package apjfsa;

public class Student1 {
	String name,course;
	int age,rollno;
	public Student1(String name,int age,int rollno,String course) {
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.course=course;
	}
	public void displayInfo() {
	System.out.println("Name:"+name);
	System.out.println("Rollno:"+rollno);
	System.out.println("Age:"+age);
	System.out.println("Course:"+course);
}


	public static void main(String[] args) {
		Student1 std=new Student1("Usha",24,133,"Java");
		System.out.println("Student Information:");
		std.displayInfo();
	}
}
