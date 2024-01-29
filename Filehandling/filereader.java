package Filehandling;
import java.io.*;

public class filereader {
    public static void main(String[] args) {
        try {
            FileReader r = new FileReader("c:\\javatpoint\\Filehandling\\writefile.txt");
            try{
                int i;
                while ((i=r.read())!=-1) {
                    System.out.print((char)i);
                }
            }
            finally{
                r.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}