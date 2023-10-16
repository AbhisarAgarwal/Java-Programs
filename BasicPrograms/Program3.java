package BasicPrograms;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        System.out.println("scanner class is uses to take user input");
        Scanner scanner  = new Scanner(System.in);
        System.out.println("enter an integer");
        int a = scanner.nextInt();
        System.out.println("user entered "+a+" as an integer");
    }
}
