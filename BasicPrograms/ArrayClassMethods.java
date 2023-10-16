package BasicPrograms;

import java.util.Arrays;
import java.util.List;

public class ArrayClassMethods {
    public static void main(String[] args) {
        String a[] = {"10","20","30","40"};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.asList(a));
        double b[][] ={{10.568584444,20.4453483},{30.743033933,40.35558398}};
        System.out.println(Arrays.deepToString(b));
    }
}
