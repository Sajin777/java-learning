import java.util.Scanner;
public class genls
{
    public static <T> int linearSearch(T[] arr, T key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(key))
            {
                return i;
            }
        }
        return -1;
    }
}
class test
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = s.nextInt();
        String[] arr = new String[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = s.next();
        }
        System.out.print("Enter key to search: ");
        String key = s.next();
        int index = genls.linearSearch(arr, key);
        if(index == -1)
        {
            System.out.println("Key not found");
        }
        else
        {
            System.out.println("Key found at index :  " + index);
        }
        s.close();
    }
}