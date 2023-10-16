package BasicPrograms;

import java.awt.geom.Area;
import java.util.Scanner;

public class Program27 {
    public static void main(String[] args) {
        System.out.println("Enter the length of sides a b and c :");
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        int c =scanner.nextInt();
        int s = (a+b+c)/2;
        float area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle is: "+area);
    }
}
