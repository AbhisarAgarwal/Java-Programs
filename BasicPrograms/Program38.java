package BasicPrograms;

import java.util.Scanner;

public class Program38 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = num;
        int rev = 0;
        while (temp!=0){ //123 , 12 , 1
            int rem = temp%10; //3 , 2 , 1
            rev = rev*10 + rem; //3 , 30+2 = 32 , 320+1
            temp /=10;// 12 , 1
        }
        if (num == rev){
            System.out.println(num+" is Palindrome Number");
        }else {
            System.out.println(num+" is Not a Palindrome Number");
        }
    }
}

