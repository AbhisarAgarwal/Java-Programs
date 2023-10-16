package BasicPrograms;

import java.util.Scanner;

public class Program48 {
    public static void main(String[] args) {
        System.out.print("Sum of all elements of array are: ");
        int[] a ={10,20,30,40,50};
        int sum = 0;
        for (int i = 0; i <a.length; i++) {
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
