package BasicPrograms;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        System.out.println("Enter Number of Natural Numbers");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum += i;
        }
        System.out.println("Sum of "+n+" Natural Numbers is "+sum);
    }
}
