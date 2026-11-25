class Emp
{
    String name;
    int age;
    double salary;
    String department;
    Emp(String n, int a, double s, String d)
    {
        name = n;
        age = a;
        salary = s;
        department = d;
    }
    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Department : " + department);
        System.out.println();
    }
}
class EmpDetails
{
    public static void main(String args[])
    {
        Emp e1 = new Emp("Sajin", 20, 35000, "CSE");
        Emp e2 = new Emp("Rahul", 25, 42000, "ECE");
        Emp e3 = new Emp("Priya", 23, 40000, "EEE");
        Emp e4 = new Emp("Anitha", 24, 45000, "IT");
        Emp e5 = new Emp("Karthik", 26, 50000, "Mechanical");
        System.out.println("-----Employee Details-----");
        System.out.println("");
        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
    }
}