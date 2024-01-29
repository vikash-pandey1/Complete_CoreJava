package Filehandling;

import java.io.*;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) throws IOException{
        // File f = new File("c:\\javatpoint\\Filehandling\\new.txt");
        // if(f.createNewFile()){
        //     System.out.println("File created successfully");
        // }
        // else{
        //     System.out.println("File is already exist");
        //}
        File f = new File("C:\\Javatpoint\\Filehandling\\new.txt");
        if(f.createNewFile()){
            System.out.println("file successfully created...");
        }
        else
        System.out.println("new.txt file already exist.");

    }
}
