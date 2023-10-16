package BasicPrograms;

import java.util.Scanner;

public class Program65 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int fact =fact(num);
        System.out.println(fact);

    }
    static int fact(int n){
        if (n==1) {
            return 1;
        } else{
            return n * fact(n - 1);
        }
    }
}
