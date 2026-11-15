import java.lang.String;
import java.util.Scanner;
class validity 
{
    public static void main(String[] args)
    {
        int equ;
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        String i=sc.nextLine();
        if(i.isEmpty())
            System.out.println("No input given");
        else if(i.matches("[a-zA-Z]+"))
            System.out.println("Wrong input: String");
        else
        {
            try
            {
                int n=Integer.parseInt(i);
                equ=n+5;
                System.out.println(equ);
            }
            finally
            {
                System.out.println("problem performed");
            }
        }
    }  

}