package BasicPrograms;

import java.util.Scanner;

public class Program30 {
    public static void main(String[] args) {
        System.out.println("Enter the number to check if positive or negative: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num>0){
            System.out.println( num +" is Positive");
        } else if (num < 0) {
            System.out.println( num +" is Negative");
        }
    }
}
