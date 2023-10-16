package BasicPrograms;

import java.util.Scanner;

public class Program40 {
    public static void main(String[] args) {
        System.out.println("Enter a number to find its square root: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = (int) Math.sqrt(num);
        System.out.println("Square root of "+num+" is "+result);
    }
}
