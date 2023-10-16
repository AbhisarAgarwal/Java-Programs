package BasicPrograms;

public class Program62 {
    public static void main(String[] args) {
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("original matrix is: ");
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("mirror matrix is: ");
        for (int i = 0; i <3; i++) {
            for (int j = 2; j >=0; j--) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
