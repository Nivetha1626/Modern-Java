
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class day13 {
static void main(){
    Path path = Path.of("files","report.txt");
    try{
        List<String> newData = new ArrayList<>();
        List<String> data = Files.readAllLines(path);

        for (String line : data) {
            System.out.println(line);
        }
        newData.add("Student1");
        newData.add("Student2");
        newData.add("Student3");
        newData.add("Student4");
        newData.add("Student5");
    } catch (IOException io){
        System.out.println("Error reading file");
    }
}
}
