package week_2;

public class Student {
	
	private String StudentName;
	private int StudentID;
	private int StudentYOS;
	
	public Student(String name, int id, int yos){
		this.StudentName = name;
		this.StudentID = id;
		this.StudentYOS = yos;
	}
	
	public void Show() {
		System.out.println("Name: " + StudentName);
		System.out.println("ID: " + StudentID);
		System.out.println("Years of study: " + StudentYOS);
	}
	
	public void AutoId() {
		StudentID += 1;
	}

	public static void main(String[] args) {
		Student studen = new Student("Alis", 1, 2024);
		studen.Show();
		studen.AutoId();
		studen.Show();
	}

}
