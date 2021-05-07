import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name+ ":" + marks;
    }
        
    public int getMarks() {
        return marks;
    }
    
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        List<Student> ls = Arrays.asList(
            new Student("S1", 20),
            new Student("S3", 30),
            new Student("S3", 20)
        );

        Map<Integer, List<Student>> grouping = ls.stream().collect(
            Collectors.groupingBy(Student::getMarks )
        );
        System.out.println(grouping);
    }
}
