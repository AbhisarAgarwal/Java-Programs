package BasicPrograms;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range");
        int n = scanner.nextInt();
        System.out.print(" [ ");
        for (int i = 1; i < n; i++) {
            if (i%2 == 1){
                System.out.print(i+" ");
            }
        }
        System.out.print("] ");
    }

}
