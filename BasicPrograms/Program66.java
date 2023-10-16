package BasicPrograms;

public class Program66 {
    public static void main(String[] args) {
        String a = "Ajay";
        String b ="RAJESH";
        System.out.println(b.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(b.concat(a));
        System.out.println(a.length());
        String c = "   Rahul    ";
        System.out.println(c.trim());//removes white spaces
        System.out.println(a.isEmpty());
        String d = " ";
        System.out.println(d.isEmpty()); //accepts white space as non empty
        System.out.println(d.isBlank());
        System.out.println(b.charAt(2));
        System.out.println(a.indexOf("j"));
        System.out.println(b.replace('J','J'));
    }
}
