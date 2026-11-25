import java.util.Scanner;
class mattrans
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[][] a=new int[3][3];
        int[][] b=new int[3][3];
        int i,j;
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
                b[i][j]=a[j][i];
            }
        }
        System.out.println("-----Transpose of matrix A-----");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println(b[i][j]);
            }
        }
        sc.close();
    }
}
