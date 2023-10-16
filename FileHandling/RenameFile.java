package FileHandling;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
       try {
           File f1 = new File("C:\\Users\\abhis\\IdeaProjects\\Java Programs\\src\\FileHandling\\f1");
           File f2 = new File("C:\\Users\\abhis\\IdeaProjects\\Java Programs\\src\\FileHandling\\f2");
           if (f1.exists()){
               System.out.println(f1.renameTo(f2));
           }else {
               System.out.println("file didn't existed");
           }
       }catch (Exception e){
           e.getMessage();
       }

    }
}
