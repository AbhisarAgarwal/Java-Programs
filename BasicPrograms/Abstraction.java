package BasicPrograms;

abstract class animal{
    animal(){
        System.out.println("Animals");
    }
    public abstract void sound();
}

class Dog extends animal{
   Dog() {}
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
class Lion extends animal{
     Lion(){}
    @Override
    public void sound() {
        System.out.println("Lion Roars");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        Lion lion = new Lion();
        lion.sound();
    }
}
