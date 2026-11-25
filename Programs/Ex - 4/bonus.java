import java.util.Scanner;
abstract class bonus
{
    String field, name;
    double salary;
    abstract double calculateBonus();
}
class employee extends bonus
{
    employee(String name, String field, double salary)
    {
        this.name=name;
        this.field=field;
        this.salary=salary;
    }
    @Override
    double calculateBonus()
    {
        return salary*0.1;
    }
}
class manager extends employee
{
    manager(String name, String field, double salary)
    {
        super(name, field, salary);
    }
    @Override
    double calculateBonus()
    {
        return salary*0.2;
    }
}
class developer extends employee
{
    developer(String name, String field, double salary)
    {
        super(name, field, salary);
    }
    @Override
    double calculateBonus()
    {
        return salary*0.15;
    }
}
class intern extends employee
{
    intern(String name, String field, double salary)
    {
        super(name, field, salary);
    }
    @Override
    double calculateBonus()
    {
        return salary*0.05;
    }
}
class festbonus
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter employee type [1.employee 2.manager 3.developer 4.intern]: ");
        int choice=s.nextInt();
        System.out.print("Enter employee name: ");
        String name=s.next();
        System.out.print("Enter employee field: ");
        String field=s.next();
        System.out.print("Enter employee salary: ");
        double salary=s.nextDouble();
        switch(choice)
        {
            case 1:
                employee e=new employee(name, field, salary);
                System.out.println("Bonus for employee " + name + " is: " + e.calculateBonus());
                break;
            case 2:
                manager m=new manager(name, field, salary);
                System.out.println("Bonus for manager " + name + " is: " + m.calculateBonus());
                break;
            case 3:
                developer d=new developer(name, field, salary);
                System.out.println("Bonus for developer " + name + " is: " + d.calculateBonus());
                break;
            case 4:
                intern i=new intern(name, field, salary);
                System.out.println("Bonus for intern " + name + " is: " + i.calculateBonus());
                break;
            default:
                System.out.println("Invalid choice");
        }
        s.close();
    }
}