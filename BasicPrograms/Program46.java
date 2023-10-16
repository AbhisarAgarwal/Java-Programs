package BasicPrograms;

import java.util.Scanner;

public class Program46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array elements in reverse order are: ");
        int[] a ={10,20,30,40,50};
        for (int i = a.length-1; i >=0; i--) {
            System.out.println(a[i]);
        }
    }
}
