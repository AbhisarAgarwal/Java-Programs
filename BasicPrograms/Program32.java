package BasicPrograms;

import java.util.Scanner;

public class Program32 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num%5==0){
            System.out.println(num+" is divisible by 5 ");
        }else
        {
            System.out.println(num+" is not divisible by 5");
        }
    }
}
