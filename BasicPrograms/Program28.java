package BasicPrograms;

import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers to swap: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("The two numbers before swapping are: "+ a +" "+ b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("The two numbers after swapping are: "+ a +" "+ b);
    }
}
