package BasicPrograms;

public class Program63 {
    int a = 10;
    static int b = 20;
    public static void main(String[] args) {
        Program63 pg63 = new Program63();
        pg63.display();
        show();
    }
    static void show(){
        System.out.println("Static method:"+b);
    }
    void display(){
        System.out.println("non static"+a+" "+b);
    }
}
