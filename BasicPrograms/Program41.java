package BasicPrograms;

import java.util.Scanner;

public class Program41 {
    public static void main(String[] args) {
        System.out.println("Enter an number to check if its prime or not: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 2; i <=num/2; i++) {
            if (num%i==0){
                count++;
            }
        }
        if (count>=1) {
            System.out.println(num+" is not Prime number");
        }else {
            System.out.println(num+" is Prime number");
        }
        }
    }

