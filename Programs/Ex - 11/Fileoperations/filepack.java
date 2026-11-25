package Fileoperations;

import java.io.IOException;

public class filepack
{
    public static void main(String arg[])
    {
        FileWriterDemo obj = new FileWriterDemo();
        try
        {
            obj.writeFile();
            obj.readFile();
        }
        catch (IOException e)
        {
            System.out.println("File error: " + e.getMessage());
        }
    }
}