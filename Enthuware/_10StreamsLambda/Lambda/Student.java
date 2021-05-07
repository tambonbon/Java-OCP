package Enthuware._10StreamsLambda.Lambda;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
    public static enum Grade {A, B, C ,D}

    private String name;
    private Grade grade;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return this.grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Student(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("John", Grade.A),
            new Student("Cherry", Grade.C),
            new Student("Ben", Grade.A)
        );

        Map<Grade, List<String>> mapping = students.stream()
                            .collect(
                                Collectors.groupingBy(
                                    Student::getGrade,
                                    Collectors.mapping(
                                        Student::getName, Collectors.toList())
                                )
                            );
        System.out.println(mapping);
    }
}
