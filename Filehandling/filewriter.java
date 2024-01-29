package Filehandling;
import java.io.*;
public class filewriter {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("C:\\Javatpoint\\Filehandling\\writefile.txt");
            try {
                f.write("java programming  is the best language...");
            } 
            finally{
                f.close();
            }
            System.out.println("successfully data wrote in file ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
