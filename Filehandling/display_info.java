package Filehandling;

import java.io.*;
public class display_info {
    public static void main(String[] args) {
        File f = new File("C:\\Javatpoint\\Filehandling\\new.txt");
        if(f.exists()){
            System.out.println("file name:"+f.getName());
            System.out.println("file location:"+f.getAbsolutePath());
            System.out.println("file writable:"+f.canWrite());
            System.out.println("file redable:"+f.canRead());
            System.out.println("file size:"+f.length());
            System.out.println("file executable:"+f.canExecute());
            System.out.println("make directory:"+f.mkdir());
            System.out.println("file exist:"+f.exists());
            System.out.println("file list:"+f.list());
            //System.out.println("file remove :"+f.delete());
        }
        else
        System.out.println("sorry file is not exist  ");
    }
}
