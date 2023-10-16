package BasicPrograms;

public class Program51 {
    public static void main(String[] args) {
        System.out.println("Array before sorting: ");
        int a[] ={23,54,32,11,8,65,89,40};

        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = i+1; j <a.length; j++) {
                if (a[i] >=a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\nArray after sorting in ascending order: ");
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
