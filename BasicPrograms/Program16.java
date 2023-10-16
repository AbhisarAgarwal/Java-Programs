package BasicPrograms;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=scanner.nextInt();
        System.out.println("Enter second number:");
        b=scanner.nextInt();
        if (a>b){
            System.out.println(a+" is greater than "+b);
        } else if (b>a) {
            System.out.println(b + " is greater than "+a);
        }else System.out.println("Both a and b are equal");
    }
}
