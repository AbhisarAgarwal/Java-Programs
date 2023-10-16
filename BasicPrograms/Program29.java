package BasicPrograms;

import java.util.Scanner;

public class Program29 {
    public static void main(String[] args) {
        System.out.println("Enter the String to convert from lower to uppercase: ");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b =" ";
        for (int i = 0; i < a.length(); i++) {
             b+= Character.toUpperCase(a.charAt(i));
        }
        System.out.println("The character after conversion is: " +b);
    }
}
