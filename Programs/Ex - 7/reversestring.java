import java.util.Scanner;
class string
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        char[] temp = new char[str.length()];
        //Reverse string using char array
        System.out.println("--- Using charArray ---");
        System.out.print("Reversed string: ");
        for(int i=str.length()-1; i>=0; i--)
        {
            System.out.print(ch[i]);
        }
        System.out.println();
        //Reverse string using StringBuilder
        System.out.println("--- Using StringBuilder ---");
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed string: " + sb.reverse());
         //Reverse string using loop
        System.out.println("--- Using Loop ---");
        for(int i=0; i<str.length(); i++)
        {
            temp[i] = ch[str.length()-1-i];
        }
        System.out.println("Reversed string: " + new String(temp));
        sc.close();
    }
}