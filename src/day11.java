import java.util.HashMap;
import java.util.Map;

import java.util.HashSet;
/*import java.util.Set;
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
 */

public class day11 {
    public static void main(String[] args) {
        Map<String, Integer> person = new HashMap<>();
        person.put("Ram", 89);
        person.put("John", 78);
        person.put("Aravindh", 67);
        person.put("Ramesh", 90);
        System.out.println(person.get("Ram"));
        person.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }
}