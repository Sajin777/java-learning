import java.util.Scanner;
public class genmax
{
    public static <T extends Comparable<T>> T Max(T a, T b, T c)
    {
        T max = a;
        if(b.compareTo(max) > 0)
        {
            if(c.compareTo(max)> 0)
            {
                max = c;
            }
            else
            {
                max = b;
            }
        }
        return max;
    }
}
class test
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        Integer x = s.nextInt();
        Integer y = s.nextInt();
        Integer z = s.nextInt();
        System.out.println("Maximum of " +x + ", " +y + ", " +z + " is: " +genmax.Max(x, y, z));
        System.out.print("Enter three doubles: ");
        Double a = s.nextDouble();
        Double b = s.nextDouble();
        Double c = s.nextDouble();
        System.out.println("Maximum of " +a + ", " +b + ", " +c + " is: " +genmax.Max(a, b, c));
        System.out.print("Enter three strings: ");
        String s1 = s.next();
        String s2 = s.next();
        String s3 = s.next();
        System.out.println("Maximum of " +s1 + ", " +s2 + ", " +s3 + " is: " +genmax.Max(s1, s2, s3));
        s.close();
    }
}