package BasicPrograms;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMethods {
    public static void main(String[] args) {
        System.out.println("Array after using sort() method is: ");
        Integer[] a = {23, 54, 32, 11, 8, 65, 89, 40};
        System.out.println("Array in ascending order: ");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Array in descending order: ");
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));

        System.out.println("\nTo check if two arrays have same data or elements we use equals() method: ");
        int[] b={23, 54, 32, 11};
        int[] c={23, 54, 32, 11};
        System.out.println("Elements in Array b are: "+Arrays.toString(b));
        System.out.println("Elements in Array c are: "+Arrays.toString(c));
        System.out.println("Hence both elements of array are equal"+Arrays.equals(b,c));

        System.out.println("\nTo copy elements of one array to another array we use copyOf() method");
        int[] OgArray={23, 54, 32, 11};
        int[] copyOfOgArray = Arrays.copyOf(OgArray,OgArray.length);
        System.out.println(Arrays.toString(copyOfOgArray));
    }
}