package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class File3 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\abhis\\IdeaProjects\\Java Programs\\src\\FileHandling\\f2");
            try {
                int i;
                while ((i=fileReader.read())!=-1){
                    System.out.print((char)i);
                }
                fileReader.close();
            }catch (Exception e){
                e.getMessage();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
