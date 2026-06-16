
import java.util.ArrayList;
public class day10 {
    static void main() {
        ArrayList<String> list = new ArrayList();
        list.add("Nivetha");
        list.add("Narthika");
        list.add("Mithra");
        list.add("Pooja");
        list.add("Ram");
        System.out.println();
        list.remove("Ram");
        list.add("Monisha");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();
    }
}



