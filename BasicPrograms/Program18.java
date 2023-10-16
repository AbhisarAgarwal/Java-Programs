package BasicPrograms;

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        int n ;
        int fact= 1;
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            fact *= i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
