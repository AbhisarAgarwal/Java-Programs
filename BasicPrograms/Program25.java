package BasicPrograms;

import java.awt.geom.Area;
import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {
        System.out.println("Enter radius of circle: ");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        System.out.println("Area of circle is :"+ (Math.PI*r*r));
    }
}
