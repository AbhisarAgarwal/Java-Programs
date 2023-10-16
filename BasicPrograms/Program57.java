package BasicPrograms;

import java.util.Scanner;

public class Program57 {
    public static void main(String[] args) {
        int size,pos,val,i;
        System.out.println("Enter size of array: ");
        Scanner scanner = new Scanner(System.in);
        size =scanner.nextInt();
        int[] a =new int[size];
        System.out.println("Enter the elements: ");
        for (i = 0;i<size ; i++) {
            a[i] =scanner.nextInt();
        }
        System.out.println("Enter location of element to be deleted: ");
        pos=scanner.nextInt();
        //1 2 3 4 5 6
        for (i=pos;i <size-1 ; i++) {
            a[i] = a[i+1];
        }
        size--;
        for (i = 0; i <size; i++) {
            System.out.println(a[i]+" ");
        }
    }
}
