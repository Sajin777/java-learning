//package mathutils;
import mathutils.Calculator;
import java.util.Scanner;

class calpack
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.print("Enter two numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print("Enter the choice [1.Add 2.Sub 3.Mul 4.Div]: ");
        int choice = s.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Addition: " + c.add(a, b));
                break;
            case 2:
                System.out.println("Subtraction: " + c.sub(a, b));
                break;
            case 3:
                System.out.println("Multiplication: " + c.mul(a, b));
                break;
            case 4:
                System.out.println("Division: " + c.div(a, b));
                break;
            default:
                System.out.println("Invalid choice");
        }
        s.close();
    }
}
