package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyAFile {
    public static void main(String[] args) {
        try {
            FileInputStream r1 = new FileInputStream("C:\\Users\\abhis\\IdeaProjects\\Java Programs\\src\\FileHandling\\File1.txt");
            FileOutputStream r2 = new FileOutputStream("C:\\Users\\abhis\\IdeaProjects\\Java Programs\\src\\FileHandling\\File2.txt");
            try {
                int i;
                while ((i=r1.read())!=-1){
                    r2.write((char)i);
                }
            }catch (Exception e){
                e.getMessage();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
