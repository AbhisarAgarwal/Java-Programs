package BasicPrograms;

 class A {
    int a = 20;
    int b = 30;

    //    Constructor overloading : when constructors of different parameters are created
    A() {
        System.out.println("a is :" + a + "and b is :" + b);
    }

    A(int x) {
        a = x;
        System.out.println("a is :" + a);
    }

    A(float y) {
        b = (int) y;
        System.out.println("b is :" + b);
    }

    A(int x, int y) {
        a = x;
        b = y;
        System.out.println("a is :" + a + "and b is :" + b);
    }
}
    public class Program68{
        public static void main(String[] args) {
            A a1 = new A();
            A a2 = new A(50);
            A a3 = new A(90F);
            A a4 = new A(100 , 200);
        }
    }
