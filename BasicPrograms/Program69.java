package BasicPrograms;

public class Program69 {
    public static void go() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        go();
    }
}
