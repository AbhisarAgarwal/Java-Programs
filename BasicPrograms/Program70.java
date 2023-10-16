package BasicPrograms;

import java.util.InvalidPropertiesFormatException;

public class Program70 {
    static class InvalidAgeException extends Exception{
        InvalidAgeException(String msg){
            System.out.println(msg);
        }
    }
    public static void main(String[] args) {
        try {
            vote(7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void vote(int age)throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("Age is less then 18");
        }else{
            System.out.println("Eligible for voting");
        }
    }

}
