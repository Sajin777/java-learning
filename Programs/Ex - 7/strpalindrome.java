import java.util.Scanner;
class strpalindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int count = 0;
        char[] ch = str.toCharArray();
        char[] temp = new char[str.length()];
        for(int i=0; i<str.length(); i++)
        {
            temp[i] = ch[str.length()-1-i];
        }
        for(int i=0; i<str.length(); i++)
        {
            if(temp[i] == ch[i])
            {
                continue;
            }
            else
                count = 1;
        }
        if(count == 0)
        {
            System.out.println("The string is a palindrome");
        }
        else
        {
            System.out.println("The string is not a palindrome");
        }
        sc.close();
    }
}
