package BasicPrograms;

import java.util.Scanner;

public class Program20 {

    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        if (age >=18) {
            System.out.println("The person is eligible to vote");
        }
        else {
            System.out.println("The person is not eligible to vote");
        }

    }
}
