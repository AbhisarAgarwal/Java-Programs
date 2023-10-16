package BasicPrograms;

import java.util.Scanner;

public  class Program9 {
    public static void main(String[] args) {
        System.out.println("Enter Range ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum= 0;
        if (n % 2 == 0){
            System.out.println("n is Even hence ");
            for (int i = 0; i <=n ; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println("Sum of Even Numbers is "+sum);
        } else if (n % 2 == 1) {
            System.out.println("n is Odd hence ");
            for (int i = 1; i <=n ; i++) {
                if (i % 2 == 1) {
                    sum += i;
                }
            }
            System.out.println("Sum of Odd Numbers is "+sum);
        }
    }
}
