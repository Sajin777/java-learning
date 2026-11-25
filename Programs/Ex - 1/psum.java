import java.util.Scanner;
class psum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter number (0 to stop): ");
        int num = sc.nextInt();
        while(num!=0)
        {
            System.out.print("Enter number: ");
            num = sc.nextInt();
            if(num == 0)
                break;
            if(num > 0) 
                sum += num;
        }
        System.out.println("Sum of positive numbers: " + sum);
    }
}