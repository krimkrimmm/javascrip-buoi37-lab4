// repository/FakeDB.java
package vn.scrip.buoi37_bvn.repository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import vn.scrip.buoi37_bvn.model.Course;
import vn.scrip.buoi37_bvn.model.Student;

import java.util.*;

@Component
public class FakeDB {
    public final Map<Integer, Course> courses = new HashMap<>();
    public final Map<Integer, Student> students = new HashMap<>();

    @PostConstruct
    public void init()
    {
        students.put(1, new Student(1, "Alice", "alice@example.com"));
        students.put(2, new Student(2, "Bob", "bob@example.com"));
        students.put(3, new Student(3, "Charlie", "charlie@example.com"));

        courses.put(100, new Course(100, "Java Spring", "Spring Boot Fundamentals", new ArrayList<>()));
        courses.put(101, new Course(101, "GraphQL", "Intro to GraphQL with Spring Boot", new ArrayList<>()));
    }
}



