package BasicPrograms;

import java.util.Scanner;

public class Program56 {
    public static void main(String[] args) {
        int size,pos,val,i;
        System.out.println("Enter size of array: ");
        Scanner scanner = new Scanner(System.in);
        size =scanner.nextInt();
        int[] a =new int[size+1];
        System.out.println("Enter the elements: ");
        for (i = 0;i<size ; i++) {
            a[i] =scanner.nextInt();
        }
        System.out.println("Enter location of new element to be inserted: ");
        pos=scanner.nextInt();
        System.out.println("Enter value of element: ");
        val=scanner.nextInt();

        for (i=size;i >pos ; i--) {
            a[i]=a[i-1];
        }
        a[pos]=val;
        size++;

        for (i = 0; i <size; i++) {
            System.out.println(a[i]+" ");
        }
    }
}
