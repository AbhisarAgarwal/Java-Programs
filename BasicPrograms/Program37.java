package BasicPrograms;

import java.util.Scanner;

public class Program37 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print("Sum of all the digits of "+num+" is: ");
        int sum = 0;
        while (num!=0){
            int rem = num%10;
            sum +=rem;
            num /=10;
        }
        System.out.println(sum);
    }
}
