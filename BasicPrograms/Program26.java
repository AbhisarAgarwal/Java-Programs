package BasicPrograms;

import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {
        System.out.println("Enter length of side of a square: ");
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        System.out.println("Area of square is: "+side*side);
    }
}
