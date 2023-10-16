package BasicPrograms;

public class Program44 {
    public static void main(String[] args) {
        int[] a;
        a = new int[]{1,2,3,4,5,6};
        System.out.println("for loop");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("\nfor each loop");
        for (int i:a) {
            System.out.print(i+" ");
        }
    }
}
