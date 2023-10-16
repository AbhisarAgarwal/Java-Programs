package BasicPrograms;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        System.out.println("Enter no. of natural numbers to be printed");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            System.out.println(i);
        }

    }
}
