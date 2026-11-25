import java.util.Scanner;
class Person
{
    String name;
    double DOB;
    Person(String name,double DOB)
    {
        this.name=name;
        this.DOB=DOB;
    }
    void displaydetails()
    {
        System.out.println("Name:"+name);
        System.out.println("Date of Birth:"+DOB);
    }
}
class Teacher extends Person
{
    double salary;
    String dept;
    Teacher(String name,double DOB,double salary,String dept)
    {
        super(name,DOB);
        this.salary=salary;
        this.dept=dept;
    }
    void displaydetails()
    {
        super.displaydetails();
        System.out.println("Salary:"+salary);
        System.out.println("Department:"+dept);
    }
}
class Student extends Person
{
    long Aaparid;
    Student(String name,double DOB,long Aaparid)
    {
        super(name,DOB);
        this.Aaparid=Aaparid;
    }
    void displaydetails()
    {
        super.displaydetails();
        System.out.println("Aaparid:"+Aaparid);
    }
}
class CollegeStudent extends Student
{
    String college_name;
    int YOS;
    CollegeStudent(String name,double DOB,long Aaparid,String college_name,int YOS)
    {
        super(name,DOB,Aaparid);
        this.college_name=college_name;
        this.YOS=YOS;
    }
    void displaydetails()
    {
        super.displaydetails();
        System.out.println("College Name:"+college_name);
        System.out.println("Year of Study:"+YOS);
    }
}
class human
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the name of the person:");
        String name=s.nextLine();
        System.out.print("Enter the date of birth of the person:");
        double DOB=s.nextDouble();
        System.out.print("Enter the type (1.teacher 2.student): ");
        int type=s.nextInt();
        switch(type)
        {
            case 1:
                System.out.print("Enter the salary of the teacher:");
                double salary=s.nextDouble();
                System.out.print("Enter the department of the teacher:");
                String dept=s.next();
                System.out.println("----Teacher Details----");
                Teacher t=new Teacher(name,DOB,salary,dept);
                t.displaydetails();
                break;
            case 2:
                System.out.print("Enter the Aaparid of the student:");
                long Aaparid=s.nextLong();
                System.out.print("Enter the type of student (1.College 2.Non-College): ");
                int sType=s.nextInt();
                if(sType==1)
                {
                    System.out.print("Enter the college name of the student:");
                    String college_name=s.next();
                    System.out.print("Enter the year of study of the student:");
                    int YOS=s.nextInt();
                    CollegeStudent cs=new CollegeStudent(name,DOB,Aaparid,college_name,YOS);
                    System.out.println("----College Student Details----");
                    cs.displaydetails();
                    break;
                }
                else if(sType==2)
                {
                    System.out.println("----Non-College Student Details----");
                    Student st=new Student(name,DOB,Aaparid);
                    st.displaydetails();
                    break;
                }
                else
                {
                    System.out.println("Invalid student type");
                    break;
                }
            default:
                System.out.println("Invalid type");
        }
        s.close();
    }
}