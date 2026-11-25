interface studentresult
{
	void displayDetails();
	void displayResult();
}
class Student implements studentresult
{
	private String name;
	private int rollNumber;
	private int java;
	private int ds;
	private int dbms;
	Student(String name, int rollNumber, int java, int ds, int dbms)
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.java = java;
		this.ds = ds;
		this.dbms = dbms;
	}
	@Override
	public void displayDetails()
	{
		System.out.println("Student Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
	}
	@Override
	public void displayResult()
	{
		int total = java+ds+dbms;
		double percentage = total/3;
		String grade;
		if (percentage >= 90)
		{
			grade = "A";
		}
		else if (percentage >= 75)
		{
			grade = "B";
		}
		else if (percentage >= 60)
		{
			grade = "C";
		}
		else if (percentage >= 40)
		{
			grade = "D";
		}
		else
		{
			grade = "F";
		}
		System.out.println("Java: "+java);
		System.out.println("ds: "+ds);
		System.out.println("dbms: "+dbms);
		System.out.println("Total Marks: "+total);
		System.out.println("Percentage: "+percentage+"%");
		System.out.println("Grade: "+grade);
	}
}
class StudentResultTest
{
	public static void main(String[] args)
	{
		Student student = new Student("Sajin", 104099, 85, 78, 92);
		student.displayDetails();
		student.displayResult();
	}
}