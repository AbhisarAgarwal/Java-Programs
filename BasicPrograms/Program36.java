package BasicPrograms;

import java.util.Scanner;

public class Program36 {
    public static void main(String[] args) {
        System.out.println("Enter a number to reverse: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print(" Reverse of "+num+" is : ");
        int rev = 0;
        while (num!=0){ //123 , 12 , 1
            int rem = num%10; //3 , 2 , 1
            rev = rev*10 + rem; //3 , 30+2 = 32 , 320+1
            num /=10;// 12 , 1
        }
        System.out.print(rev);
    }
}
