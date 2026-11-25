import java.util.Scanner;
class Student
{
    private String name;
    private int rollNo;
    private double totalMarks;
    void Name(String name)
    {
        this.name = name;
    }
    void Rollno(int roll)
    {
        this.rollNo = roll;
    }
    void TotalMarks(double Marks)
    {
        this.totalMarks = Marks;
    }
    char Grade()
    {
        if (totalMarks >= 90) 
        {
            return 'S';
        } 
        else if (totalMarks >= 80)
        {
            return 'A';
        } 
        else if (totalMarks >= 70)
        {
            return 'B';
        } else if (totalMarks >= 60)
        {
            return 'C';
        }
        else
        {
            return 'U';
        }
    }
    void display()
    {
        System.out.println("---Student Details---");
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Grade: " +Grade());
    }
}
class stdgrade
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student std = new Student();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        std.Name(name);
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        std.Rollno(roll);
        System.out.print("Enter Total Marks: ");
        double Marks = sc.nextDouble();
        std.TotalMarks(Marks);
        std.display();
        sc.close();
    }
}