//import java.util.LinkedList;
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
/*
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
 */
import java.util.LinkedList;

public class day10 {

    static class Student {
        String name;
        int regNo;
        int marks;

        Student(String name, int regNo, int marks) {
            this.name = name;
            this.regNo = regNo;
            this.marks = marks;
        }
    }

    static void removeStudent(LinkedList<Student> students) {
        System.out.println("Removed : " + students.removeFirst().name);
    }

    static void updateStudent(LinkedList<Student> students) {
        for (Student s : students) {
            if (s.name.equals("Mithra")) {
                s.marks = 95; // Update marks from 85 to 95
            }
        }
    }

    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<>();

        // Add 5 Students
        students.add(new Student("Nive", 101, 80));
        students.add(new Student("Narthi", 102, 75));
        students.add(new Student("Mithra", 103, 90));
        students.add(new Student("Menaga", 104, 85));
        students.add(new Student("Sweatha", 105, 88));

        // Remove 1 Student
        removeStudent(students);

        // Update 1 Student
        updateStudent(students);

        // Display Students
        System.out.println("\nStudent Details");
        for (Student s : students) {
            System.out.println(
                    s.name + " " +
                            s.regNo + " " +
                            s.marks
            );
        }
    }
}

