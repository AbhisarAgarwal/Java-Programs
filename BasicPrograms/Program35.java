package BasicPrograms;

import java.util.Scanner;

public class Program35 {
    public static void main(String[] args) {
        System.out.println("Enter Month Number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Month is January and has 31 days");
                break;
            case 2:
                System.out.println("Month is February and has 28 days");
                break;
            case 3:
                System.out.println("Month is March and has 31 days");
                break;
            case 4:
                System.out.println("Month is April and has 30 days");
                break;
            case 5:
                System.out.println("Month is May and has 31 days");
                break;
            case 6:
                System.out.println("Month is June and has 30 days");
                break;
            case 7:
                System.out.println("Month is July and has 31 days");
                break;
            case 8:
                System.out.println("Month is August and has 31 days");
                break;
            case 9:
                System.out.println("Month is September and has 30 days");
                break;
            case 10:
                System.out.println("Month is October and has 31 days");
                break;
            case 11:
                System.out.println("Month is November and has 30 days");
                break;
            case 12:
                System.out.println("Month is December and has 31 days");
                break;
            default:
                System.out.println("Month number is invalid ");
                break;
        }
    }
}
