package BasicPrograms;

import java.util.Scanner;

public class Program34 {
    public static void main(String[] args) {
        System.out.println("Enter a Number to find its factor:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0){
                System.out.print(i+" ");
            }
        }
        System.out.print(num);
    }
}
