import java.util.Scanner;
class arrayop
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int temp,i,j;
        System.out.print("Enter the size of the array:");
        int size = s.nextInt();
        int A[] = new int[size];
        System.out.print("Enter the elements: ");
        for(i=0;i<size;i++)
        {
            A[i] = s.nextInt();
        }
        for(i=0;i<size-1;i++)
        {
            for(j=0;j<size-1-i;j++)
            {
                if(A[j] > A[j+1])
                {
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array elements: ");
        for(i=0;i<size;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println("Largest element: "+A[size-1]);
        System.out.print("Reverse elements: ");
        for(i=size-1;i>=0;i--)
        {
            System.out.print(A[i] +" ");
        }
        s.close();
    }    
}
