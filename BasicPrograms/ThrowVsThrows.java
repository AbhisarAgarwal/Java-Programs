package BasicPrograms;

class test{
    void div(int a , int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException();
        }
        else {
            int c = a/b;
            System.out.println(c);
        }
    }
}
public class ThrowVsThrows {
    public static void main(String[] args) {
        test test = new test();
        try {
            test.div(10,0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
