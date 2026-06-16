import java.util.LinkedList;
import java.util.Queue;

/*
import java.util.ArrayList;
import java.util.Queue;

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
     */
public class day10 {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("Sweatha");
        queue.add("Menaga");
        queue.add("Narthika");
        queue.add("Mithra");
        queue.add("Nivetha");
        while(!queue.isEmpty()) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);

    }
}


