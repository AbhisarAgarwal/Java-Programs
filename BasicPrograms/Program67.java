package BasicPrograms;

public class Program67 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Ankit Kumar");
        System.out.println(sb.reverse());

        StringBuilder sui = new StringBuilder("Ankit Kumar");
        System.out.println(sui.reverse());

        String s1= "AjaySingh";
        String s2= "";
        int l =s1.length();
        for (int i = l-1; i>=0 ; i--) {
            s2 = s2+s1.charAt(i);
        }
        System.out.println(s2);
    }
}
