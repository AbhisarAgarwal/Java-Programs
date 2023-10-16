package BasicPrograms;

import java.util.Scanner;

public class Program43 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("num1");
        int num1 =scanner.nextInt();
        System.out.println("num2");
        int num2 = scanner.nextInt();
        int i , j;
        System.out.println("The Prime numbers in the range of "+num1+" and "+num2+" are: ");
        for ( i = num1; i<=num2; i++) {
            for (j = 2; j<=i; j++) {
                if (i%j==0){
                    break;
                }
            }
            if (i==j)
            System.out.print(j+" ");
        }
    }
}
