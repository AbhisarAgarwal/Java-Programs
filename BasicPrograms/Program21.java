package BasicPrograms;

import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number whose multiplication table is to be printed: ");
        number = scanner.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(" "+ number + "*"+ i + " = " + (number * i));
        }
    }
}
