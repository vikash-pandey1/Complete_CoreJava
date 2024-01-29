package Filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy {
    public static void main(String[] args) throws IOException{
        FileInputStream r = new FileInputStream("C:\\Javatpoint\\Filehandling\\newfile.txt");
        FileOutputStream w = new FileOutputStream("c:\\javatpoint\\Filehandling\\writefile.txt");
        int i;
        while ((i=r.read())!=-1) {
            w.write((char)i);
        }
        System.out.println("data copied successfully ...");
    }
}
