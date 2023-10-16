package BasicPrograms;

import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {
        int length;
        int breadth;
        System.out.println("Enter length and breadth of rectangle: ");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        breadth = scanner.nextInt();
        System.out.println("Area of rectangle of length "+length+" and breadth "+breadth+" is :"+(length*breadth));
    }
}
