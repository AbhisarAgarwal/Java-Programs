package BasicPrograms;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range");
        int n = scanner.nextInt();
        System.out.print(" [ ");
        for (int i = 0; i <=n; i++) {
            if (i%2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.print("] ");
    }
}
