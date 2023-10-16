package BasicPrograms;

import java.util.Scanner;

public class Program22 {
    public static void main(String[] args) {
        int salary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        salary = scanner.nextInt();
        if (salary<=10000){
            System.out.println("Salary is: " + salary +" No Tax ");
        } else if (salary>10000 && salary <=100000) {
            System.out.println("Salary is: "+ salary + " So 10% Tax is "+ Math.round(salary *0.1) );
        }else
            System.out.println("Salary is: "+ salary + " So 20% Tax is "+ Math.round(salary *0.2) );
    }
}
