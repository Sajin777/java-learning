import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class filecopywr
{
    public static void main(String args[])
    {
        try
        {
            FileWriter myWriter = new FileWriter("copyfile.txt");
            File myObj = new File("newfile.txt");
            Scanner myreader = new Scanner(myObj);
            myWriter.write("copy from newfile.txt: ");
            while(myreader.hasNextLine())
            {
                String data = myreader.nextLine();
                myWriter.write(data);
            }
            System.out.println("content written successfully");
            try{
            File myObj1 = new File("copyfile.txt");
            Scanner myreader1 = new Scanner(myObj1);
            while(myreader1.hasNextLine())
            {
                String data = myreader1.nextLine();
                System.out.println(data);
            }
            System.out.println("File read successfully");
            myreader.close();
            myWriter.close();
            myreader1.close();
        }
        catch(IOException e)
        {
            System.out.println("Error");
        }
        }
        catch(IOException e)
        {
            System.out.println("Error occurred while writing.");
            e.printStackTrace();
        }
    }
}