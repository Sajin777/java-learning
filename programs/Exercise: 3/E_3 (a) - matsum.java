import java.util.Scanner;
class matsum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,j,sum=0;
        int[][] a = new int[3][3];
        System.out.print("Enter the elements: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                sum=sum+a[i][j];
            }
        }
        System.out.print("Sum of elements: "+sum);
        sc.close();
    }
}