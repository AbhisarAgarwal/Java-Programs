package BasicPrograms;

import java.util.Scanner;

public class Program49 {
    public static void main(String[] args) {
        System.out.print("Enter element to be searched: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] a ={10,20,30,40,50};
        for (int i = 0; i <a.length; i++) {
            if (num == a[i]){
                System.out.println(num+" is found at "+i+" index");
            }
        }


    }
}
