import java.util.Scanner;
class Arrayerror
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String choice;
        try
        {
            System.out.print("Enter the size of the array:");
            int size = Integer.parseInt(s.next());
            int A[] = new int[size];
            System.out.print("Enter the elements: ");
            for(int i=0;i<size;i++)
            {
                A[i] = s.nextInt();
            }
            do
            {
                System.out.print("Enter the index: ");
                int index = s.nextInt();
                System.out.println("Element at index "+index+" is: "+A[index]);
                System.out.print("Do you want to continue? [y/n]: ");
                choice = s.next();
            }while(choice.equals("y"));
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array exceeds the limit!");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid input!");
        }
        s.close();
    }
}