package BasicPrograms;

import java.util.Scanner;

public class Program58 {
    public static void main(String[] args) {
        System.out.println("Enter total numbers in the series: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i <n ; i++) {
             if (i<=1){
                 System.out.print(" "+i);
             }else {
                 int sum = a+b;
                 System.out.print(" "+sum);
                 a=b;
                 b=sum;
             }
        }
    }
}
