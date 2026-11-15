import java.util.Scanner;
class matadd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[][] a =new int[3][3];
        int[][] b =new int[3][3];
        int[][] c =new int[3][3];
        int i,j;
        System.out.print("Enter the elements of matrix 1: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the elements of matrix 2: ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("---Addition of Matrix---");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println(c[i][j]);
            }
        }
        sc.close();
    }   
}