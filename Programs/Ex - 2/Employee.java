import java.util.Scanner;
class Employee
{
    String name;
    int age;
    double salary;
    String department;
}
class Details
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i;
        Employee[] e = new Employee[6];
        for(i=1; i<=5; i++)
        {
            e[i] = new Employee();
            System.out.println("Enter details of employee " +i);
            System.out.print("Enter Name: ");
            e[i].name = sc.next();
            System.out.print("Enter Age: ");
            e[i].age = sc.nextInt();
            System.out.print("EnterSalary: ");
            e[i].salary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Department: ");
            e[i].department = sc.nextLine();
        }
        System.out.println("-----Employee Details-----");
        System.out.println("");
        for(i=1; i<=5; i++)
        {
            System.out.println("Name : " +e[i].name);
            System.out.println("Age : " +e[i].age);
            System.out.println("Salary : " +e[i].salary);
            System.out.println("Department : " +e[i].department);
        }
        sc.close();
    }
}