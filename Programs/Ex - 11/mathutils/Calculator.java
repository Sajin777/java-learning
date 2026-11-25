package mathutils;

public class Calculator
{
    public double add(int a, int b)
    {
        return a + b;
    }

    public double sub(int a, int b)
    {
        return a - b;
    }

    public double mul(int a, int b)
    {
        return a * b;
    }

    public double div(int a, int b)
    {
        if (b == 0)
        {
            System.out.println("Error: Division by zero");
            return 0;
        }
        else
        {
            return (double) a / b;
        }
    }
}