package BasicPrograms;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of first number");
        int a = scanner.nextInt();
        System.out.println("Enter value of second number");
        int b = scanner.nextInt();
        System.out.println("Sum of " +a+" and "+b+" is "+(a+b));
    }
}
