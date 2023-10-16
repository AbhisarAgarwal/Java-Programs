package BasicPrograms;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0)
        System.out.println(a+" is even");

        System.out.println(a+" is odd");

    }
}
