package BasicPrograms;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        a=scanner.nextInt();
        System.out.println("Enter Second Number");
        b=scanner.nextInt();
        System.out.println("Enter Third Number");
        c=scanner.nextInt();
        if (a>b && a>c){
            System.out.println(a+" is Greater than "+b+" And "+c);
        }else if(b>a && b>c){
            System.out.println(b+" is Greater than "+a+" And "+c);
        }else{
            System.out.println(c+" is Greater than "+a+" And "+b);
        }
    }
}
