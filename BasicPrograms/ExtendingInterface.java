package BasicPrograms;

interface Rohan{
    void add();
}
interface Rajeev extends Rohan{
    void sub();
}
class Raj implements Rohan{

    @Override
    public void add() {
        System.out.println("adding two numbers");
    }
}


public class ExtendingInterface { //by using implements keyword
    public static void main(String[] args) {
        Rohan rohan = new Raj();
        rohan.add();
    }
}
