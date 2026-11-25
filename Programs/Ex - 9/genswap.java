import java.util.Scanner;
class genswap
{
    public static <T> void swap(T []arr, int i, int j)
    {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
class test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two integers:");
        Integer x = sc.nextInt();
        Integer y = sc.nextInt();
        System.out.println("Before swapping: x = " +x + ", y = " +y);
        Integer[] arr = {x, y};
        genswap.swap(arr, 0, 1);
        System.out.println("After swapping: x = " +arr[0] + ", y = " +arr[1]);
        sc.close();
    }
}