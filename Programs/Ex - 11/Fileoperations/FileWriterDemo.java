package Fileoperations;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileWriterDemo
{
    public void writeFile() throws IOException
    {
        FileWriter fw = new FileWriter("message.txt");
        fw.write("Hello! This file owned by Sajin.");
        fw.close();
        System.out.println("Data written successfully.");
    }
    public void readFile() throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("message.txt"));
        String line;
        System.out.println("Contents of the file:");
        while ((line = br.readLine()) != null)
        {
            System.out.println(line);
        }
        br.close();
    }
}