package BasicPrograms;

import java.util.Scanner;

public class Program33 {
    public static void main(String[] args) {
        System.out.println("Enter code of the day between 0 to 6 : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num){
            case 0:
                System.out.println("Sunday");
                break;
                case 1:
                System.out.println("Monday");
                break;
                case 2:
                System.out.println("Tuesday");
                break;
                case 3:
                System.out.println("Wednesday");
                break;
                case 4:
                System.out.println("Thursday");
                break;
                case 5:
                System.out.println("Friday");
                break;
                case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid code for the day");
                break;
        }
    }
}
