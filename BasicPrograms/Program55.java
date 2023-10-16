package BasicPrograms;

public class Program55 {
    public static void main(String[] args) {
        int[] a = {12,43,22,48,32,7};
        System.out.print("The minimum value in the given array is: ");
        int min = a[0];

        for (int i = 0; i <a.length ; i++) {
            if (min >= a[i]){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
