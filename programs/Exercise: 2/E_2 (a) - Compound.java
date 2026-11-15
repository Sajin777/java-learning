import java.util.Scanner;
class Compound
{  
    void fibnacci()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n=sc.nextInt();
        int a=0,b=1,sum;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n;i++)
        {
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
        sc.close();
    }
    void binary_search()
    {
        int a[]={1,2,5,6,7,8,10};
        int i=1,high,low=0;
        high=a.length;
        int mid=(low+high)/2;
        System.out.print("Enter the number to be searched: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(i>0)
        {
            if(n==a[mid])
            {
                System.out.println("Element is found at "+mid);
                break;
                
            }
            else if(n>a[mid])
            {
                low=mid;
                mid=(high+low)/2;
            }
            else if(n<a[mid])
            {
                high=mid;
                mid=(high+low)/2;
            }
            else
            {
                System.out.println("Element cannot found");
            }
        }
        sc.close();
    }
    void selection_sort()
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int a[]={25,41,2,3,7,1};
        int n=a.length;
        for(i=0;i<n-1;i++)
        {
            int minindex = i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[minindex])
                {
                    minindex=j;
                    int temp=a[minindex];
                    a[minindex]=a[i];
                    a[i]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        sc.close();
    }
}
class problems
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice [1.fibnacci 2.binary_search 3.selection_sort]: ");
        int choice=sc.nextInt();
        Compound comp=new Compound();
        switch(choice)
        {
            case 1:
                comp.fibnacci();
                break;
            case 2:
                comp.binary_search();
                break;
            case 3:
                comp.selection_sort();
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
