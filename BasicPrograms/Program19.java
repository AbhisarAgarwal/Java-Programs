package BasicPrograms;

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        int n;
        int count= 0;
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();
        int temp = n;
        while (n > 0){
            n /= 10;
            ++count;
        }
        System.out.println("Number of Digits in "+temp+" are "+count);
    }
}
