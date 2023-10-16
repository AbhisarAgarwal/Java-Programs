package BasicPrograms;

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        char ch;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character");
        ch=scanner.next().charAt(0);
        n =(int)ch;
        System.out.println("ASCII Value of "+ch+" is "+n);
    }
}
