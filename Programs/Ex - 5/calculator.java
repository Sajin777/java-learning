import java.util.Scanner;
interface calculator
{
    void print(int a,int b);
}
class add implements calculator
{
    @Override
    public void print(int a,int b)
    {
        System.out.printf("Addition: %d",a+b);
    }
}
class sub implements calculator
{
    @Override
    public void print(int a,int b)
    {
        System.out.printf("Subtraction: %d",a-b);
    }

}
class mul implements calculator
{
    @Override
    public void print(int a,int b)
    {
        System.out.printf("Multiplication: %d",a*b);
    }
}
class div implements calculator
{
    @Override
    public void print(int a,int b)
    {
        System.out.printf("Division: %d",a/b);
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a=sc.nextInt();
        System.out.print("Enter num2: ");
        int b=sc.nextInt();
        System.out.print("Enter the operation [1.Add 2.Sub 3.Mul 4.Div]: ");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
                {
                    calculator cal=new add();
                    cal.print(a,b);
                    break;
                }
            case 2:
                {
                    calculator cal=new sub();
                    cal.print(a,b);
                    break;
                }
            case 3:
                {
                    calculator cal=new mul();
                    cal.print(a,b);
                    break;
                }
            case 4:
                {
                    calculator cal=new div();
                    cal.print(a,b);
                    break;
                }
            default:
                {
                    System.out.println("Invalid choice");
                }
        }
        sc.close();
    }
}