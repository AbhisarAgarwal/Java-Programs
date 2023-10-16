package BasicPrograms;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        char ch;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a character");
        ch= scanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i'||ch == 'o'||ch == 'u'){
            System.out.println(ch+" is a vowel");
        }
        else {
            System.out.println(ch+" is a consonant");
        }
    }
}
