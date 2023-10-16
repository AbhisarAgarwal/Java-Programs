package BasicPrograms;

import java.util.Scanner;

public class Program23 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        num2 =scanner.nextInt();
        boolean flag = true;

        while (flag){
            System.out.println("Enter the operation you want to perform: (mul,add,sub,div) type exit for break ");
            String ch =scanner.next();
            switch (ch){
                case "mul":
                    System.out.println("Multiplication of "+ num1 +" and " + num2 + " is:" + num1*num2);
                    break;
                case "add":
                    System.out.println("Addition of "+ num1 +" and " + num2 + " is:" + (num1+num2));
                    break;
                case "sub":
                    System.out.println("Subtraction of "+ num1 +" and " + num2 + " is:" + num1*num2);
                    break;
                case "div":
                    if (num1 > num2) {
                        System.out.println("Division of " + num1 + " and " + num2 + " is:" + num1 / num2);
                        break;
                    }
                    else {
                        System.out.println("Division of " + num2 + " and " + num1 + " is:" + num2 / num1);
                        break;
                    }
                case "exit": flag = false;
            }
        }
    }
}
