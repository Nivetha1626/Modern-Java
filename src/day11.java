import java.util.HashSet;
import java.util.Set;
public class day11 {
    public static void main() {
        Set<String> set=new HashSet<>();
        set.add("Student 2");
        for (String s : set) {
            System.out.println(s);
        }
        set.add("Student 1");
        set.add("Student 2");
        set.add("Student 1");
        set.add("Student 1");
        set.add("Student 2");
        System.out.println("set :");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
