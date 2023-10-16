package BasicPrograms;

import java.util.Arrays;

public class Program53 {
    public static void main(String[] args) {
        int[] a = {12,23,45,18,87,34};
        int[] b = a;
        if (a==b){
            System.out.println("Both are equal ==");
        } else if (Arrays.equals(a,b)) {
            System.out.println("Both are equal");
        }
    }
}
