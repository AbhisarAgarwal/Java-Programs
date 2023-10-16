package BasicPrograms;

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        int first,second,third,fourth,fifth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Marks Of First Subject");
        first=scanner.nextInt();
        System.out.println("Enter Marks Of Second Subject");
        second=scanner.nextInt();
        System.out.println("Enter Marks Of Third Subject");
        third=scanner.nextInt();
        System.out.println("Enter Marks Of Fourth Subject");
        fourth=scanner.nextInt();
        System.out.println("Enter Marks Of Fifth Subject");
        fifth=scanner.nextInt();

        double Average = (first+second+third+fourth+fifth) / 5.0;
        System.out.println("Average of Five Subjects Are :"+Average);
    }
}
