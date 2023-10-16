package BasicPrograms;

import java.util.Scanner;

public class Program42 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <=num/2; i++) {
            if (num%i==0){
                sum+=i;
            }
        }
        if (num == sum){
            System.out.println(num+" is a Perfect Number");
        }else {
            System.out.println(num+" is not a Perfect Number");
        }
    }
}
