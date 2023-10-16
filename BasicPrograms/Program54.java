package BasicPrograms;

public class Program54 {
    public static void main(String[] args) {
            int[] a = {12,43,22,48,32,7};
        System.out.print("The maximum value in the given array is: ");
        int max = a[0];

        for (int i = 0; i <a.length ; i++) {
            if (max <= a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
