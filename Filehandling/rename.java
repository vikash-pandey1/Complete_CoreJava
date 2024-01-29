package Filehandling;
import java.io.File;
public class rename {
    public static void main(String[] args) {
        File f = new File("c:\\javatpoint\\Filehandling\\new.txt");
        File r = new File("c:\\javatpoint\\Filehandling\\newfile.txt");
        if(f.exists()){
            System.out.println(f.renameTo(r));
        }
        else
        {
            System.out.println("file doesn't exist");
        }
    }
}
