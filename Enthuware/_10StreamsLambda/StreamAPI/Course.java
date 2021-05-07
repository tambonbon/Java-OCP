package Enthuware._10StreamsLambda.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Course {
    private String id;
    private String category;

    public Course (String id, String category) {
        this.id = id;
        this.category = category;
    }
    @Override
    public String toString() {
        return id + " " + category;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static void main(String[] args) {
        List<Course> s1 = Arrays.asList(
            new Course("OCAJP", "JAVA"),
            new Course("OCAJP", "JAVA"),
            new Course("C#", "C#"),
            new Course("OCEJPA", "JAVA")
        );
 List<Course> s2 = List.copyOf(s1);

       s1.stream()
            .collect(Collectors.groupingBy(c -> c.getCategory())) // this returns a map
            .forEach((m,n) ->System.out.println(n));
        // this prints out all the sets of value in the map

        Map<String, List<Course>> map = s2.stream()
        .collect(Collectors.groupingBy(c -> c.getCategory())) ;
        // {C#=[C# C#], JAVA=[OCAJP JAVA, OCAJP JAVA, OCEJPA JAVA]}
        System.out.println(map);
}
    
}
