package objAndclasses;
public class Student {
	String name;
	String courseEnrolled;

	Student(String name, String course) {
		this.name = name;
		this.courseEnrolled = course;
	}

	void getCourseEnrolled() {
		System.out.println(name + " " + "has enrolled for" + " " + courseEnrolled + " " + "course");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student("Ram", "Java");
		ram.getCourseEnrolled();
		Student vicky = new Student("Vicky", "Html");
		vicky.getCourseEnrolled();
		Student reena = new Student("Reena", "Spring");
		reena.getCourseEnrolled();

	}

}

