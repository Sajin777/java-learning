import java.util.Scanner;
class countdown
{
    public static void main(String[] args)
    {
        int i,n;
        System.out.print("Enter the countdown starting number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;i>0;i--)
        {
            System.out.println(i);
        }
        System.out.println("HAPPY NEW YEAR !!");
    }
}