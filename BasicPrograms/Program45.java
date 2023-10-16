package BasicPrograms;

import java.util.Scanner;

public class Program45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of array is: ");
        int[] a ={10,20,30,40,50};
        System.out.println(a.length);
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
