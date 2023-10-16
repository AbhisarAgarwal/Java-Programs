package BasicPrograms;

import java.util.Scanner;

public class Program39 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = num;
        int sum = 0;
        while (temp!=0){
            int rem = temp%10;
            sum +=Math.pow(rem , 3);
            temp /=10;
        }
        if (num == sum ){
            System.out.println(num+" is an Armstrong Number");
        }else {
            System.out.println(num+" is not an Armstrong Number");
        }
    }
}
