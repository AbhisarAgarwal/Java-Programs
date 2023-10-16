package BasicPrograms;

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        int n;
        int power;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        n=scanner.nextInt();
        System.out.println("Enter the Power");
        power=scanner.nextInt();
        int result =  (int)Math.pow(n,power);
        System.out.println(n+" to the Power "+power+" is "+result);
    }
}
