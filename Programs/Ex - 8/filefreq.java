import java.util.Scanner;
import java.io.File;
import java.io.IOException;
class filefreq
{
    public static void main(String arg[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the character to be searched: ");
        char ch = s.nextLine().charAt(0);
        int counter=0;
        try
        {
            File myObj = new File("newfile.txt");
            Scanner myreader = new Scanner(myObj);
            while(myreader.hasNextLine())
            {
                String data = myreader.nextLine();
                char[] a = data.toString().toCharArray();
                for(int i=0; i<a.length; i++)
                {
                    if(ch == a[i])
                    {
                        counter++;
                    }
                }
            }
            myreader.close();
        }
        catch(IOException e)
        {
            System.out.println("Error to read file");
            e.printStackTrace();
        }
        System.out.printf("Frequency of the character %c: %d", ch, counter);
        s.close();
    }
}
