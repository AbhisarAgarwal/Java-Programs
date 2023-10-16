package BasicPrograms;

import java.util.Scanner;

public class Program64 {
    static int n1,n2,add,sub,mul,div;
    public static void main(String[] args) {
          input();
          process();
          output();
    }
    static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        n1=scanner.nextInt();
        n2=scanner.nextInt();
    }
    static void process(){
        add = n1+n2;
        sub = n1-n2;
        mul = n1*n2;
        div = n1/n2;
    }
    static void output(){
        System.out.println("Sum is :"+add);
        System.out.println("Sub is :"+sub);
        System.out.println("Mul is :"+mul);
        System.out.println("Div is :"+div);
    }
}
