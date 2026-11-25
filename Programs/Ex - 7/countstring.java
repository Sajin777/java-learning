import java.util.Scanner;
public class countstring
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int vcount = 0, ccount = 0, scount = 0, dcount = 0;
        for(int i=0; i<ch.length; i++)
        {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
            {
                vcount++;
            }
            else if((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z'))
            {
                ccount++;
            }
            else if(ch[i] == ' ')
            {
                scount++;
            }
            else
            {
                dcount++;
            }
        }
        System.out.println("No.of vowels: " + vcount);
        System.out.println("No.of consonants: " + ccount);
        System.out.println("No.of spaces: " + scount);
        System.out.println("No.of digits: " + dcount);
        sc.close();
    }
}
