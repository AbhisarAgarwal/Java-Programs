package FileHandling;

import java.io.File;

public class File1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\abhis\\IdeaProjects\\Java Programs\\src\\FileHandling\\f1");
        if (file.exists()){
            System.out.println("File name is: "+file.getName());
            System.out.println("File path is: "+file.getAbsolutePath());
            System.out.println("File can be read: "+file.canRead());
            System.out.println("File can be writable: "+file.canWrite());
            System.out.println("size of file is: "+file.length());
            System.out.println("Free space in file is: "+file.getFreeSpace());
        }else {
            System.out.println("file not exists");
        }
    }
}
