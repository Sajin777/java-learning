import java.util.Scanner;
class shapes
{
    void rectangle(int l,int b)
    {
        int area=l*b;
        System.out.println("Area of rectangle: "+area);
    }
    void triangle(int l,int b)
    { 
        double area=0.5*l*b;
        System.out.println("Area of triangle: "+area);
    }
    void circle(int r)
    {
        double area=3.14*r*r;
        System.out.println("Area of circle: "+area);
    }
}
class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Area of the different shapes");
        System.out.print("Enter the option [1.rectangle, 2.triangle, 3.circle]: ");
        int choice=sc.nextInt();
        shapes sp=new shapes();
        switch(choice)
        {
            case 1:
                {
                    System.out.print("Enter the length: ");
                    int l=sc.nextInt();
                    System.out.print("Enter the breadth: ");
                    int b=sc.nextInt();
                    sp.rectangle(l,b);
                    break;
                }
            case 2:
                {
                    System.out.print("Enter the length: ");
                    int l=sc.nextInt();
                    System.out.print("Enter the breadth: ");
                    int b=sc.nextInt();
                    sp.triangle(l,b);
                    break;
                }
            case 3:
                {
                    System.out.print("Enter the radius: ");
                    int r=sc.nextInt();
                    sp.circle(r);
                    break;
                }
            default:
            {
                System.out.println("INVALID INPUT");
            }
        }
        sc.close();
    }
}