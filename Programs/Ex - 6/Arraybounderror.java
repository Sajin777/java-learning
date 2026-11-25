import java.util.Scanner;
class Arraybounderror
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the array size :");
        int size = s.nextInt();
        int A[] = new int[size];
        System.out.print("Enter the elements: ");
        try
        {
            for(int i=0;i<size;i++)
            {
                A[i] = s.nextInt();
            }
            System.out.println("Array elements: ");
            for(int i=0;i<size;i++)
            {
                System.out.print(A[i]+" ");
            }
            System.out.println();
            System.out.print("continue? [y/n]: ");
            String choice = s.next();
            if(choice.equals("y"))
            {
                System.out.print("Enter element: ");
                A[size] = s.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array exceeds the limit");
        }
        s.close();
    }
}
