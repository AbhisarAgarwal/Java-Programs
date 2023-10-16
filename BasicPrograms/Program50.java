package BasicPrograms;

public class Program50 {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        System.out.print("Average of "+a.length+" elements of array are: ");
        int sum = 0;
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];
        }
        int avg = sum/a.length;
        System.out.println(avg);
}}
