public class Employee
{
    final double epfr= 0.12;
    double basicPay;
    Employee(double basicPay)
    {
        this.basicPay = basicPay;
    }
    double calculateSalary()
    {
        return basicPay;
    }
}
class AssistantProfessor extends Employee
{
    AssistantProfessor(double basicPay)
    {
        super(basicPay);
    }
    double calculateSalary() {
        double da = basicPay * 0.10;
        double hra = basicPay * 0.20;
        double epf = basicPay * epfr;
        return basicPay + da + hra - epf;
    }
}
class AssociateProfessor extends Employee
{
    AssociateProfessor(double basicPay)
    {
        super(basicPay);
    }
    double calculateSalary() {
        double da = basicPay * 0.15;
        double hra = basicPay * 0.25;
        double epf = basicPay * epfr;
        return basicPay + da + hra - epf;
    }
}
class Professor extends Employee
{
    Professor(double basicPay)
    {
        super(basicPay);
    }
    double calculateSalary()
    {
        double da = basicPay * 0.20;
        double hra = basicPay * 0.30;
        double epf = basicPay * epfr;
        return basicPay + da + hra - epf;
    }
}
class Salary
{
    public static void main(String args[])
    {
        AssistantProfessor a = new AssistantProfessor(40000);
        AssociateProfessor b = new AssociateProfessor(60000);
        Professor c = new Professor(80000);
        System.out.println("Assistant Professor Net Salary = "+ a.calculateSalary());
        System.out.println("Associate Professor Net Salary = "+ b.calculateSalary());
        System.out.println("Professor Net Salary = "+ c.calculateSalary());
    }
}