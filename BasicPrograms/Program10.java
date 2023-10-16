package BasicPrograms;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter a character: ");
        Scanner scanner = new Scanner(System.in);
        ch=scanner.next().charAt(0);
        System.out.println("entered character is "+ch);
    }
}
