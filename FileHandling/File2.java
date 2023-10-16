package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class File2 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\abhis\\IdeaProjects\\Java Programs\\src\\FileHandling\\f2");
            try {
                fileWriter.write("This is file2");
                fileWriter.close();
            }catch (Exception e){
                e.getMessage();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
