package BasicPrograms;

import java.util.Scanner;

public class Program60 {
    public static void main(String[] args) {
        System.out.println("Enter total numbers in the series: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c = 2;
        for (int i = 0; i <n ; i++) {
            System.out.print(a+" ");
                int sum = a+b+c;
                a=b;
                b=c;
                c=sum;
            }
        }
    }

