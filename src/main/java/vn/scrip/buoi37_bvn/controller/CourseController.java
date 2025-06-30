// controller/CourseController.java
package vn.scrip.buoi37_bvn.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.*;
import org.springframework.stereotype.Controller;
import vn.scrip.buoi37_bvn.model.Course;

import vn.scrip.buoi37_bvn.model.Student;
import vn.scrip.buoi37_bvn.repository.FakeDB;
import java.util.List;
import java.util.stream.Collectors;
@Controller
@RequiredArgsConstructor
public class CourseController {

    private final FakeDB db;

    @QueryMapping
    public List<Course> allCourses() {
        return db.courses.values().stream().toList();
    }

    @QueryMapping
    public Course courseById(@Argument Integer id) {
        return db.courses.get(id);
    }

    @MutationMapping
    public Course addStudentToCourse(@Argument Integer courseId, @Argument Integer studentId) {
        Course course = db.courses.get(courseId);
        if (course != null && db.students.containsKey(studentId)) {
            if (!course.getStudentIds().contains(studentId)) {
                course.getStudentIds().add(studentId);
            }
        }
        return course;
    }

    @SchemaMapping(typeName = "Course", field = "students")
    public List<Student> resolveStudents(Course course) {
        return course.getStudentIds().stream()
                .map(db.students::get)
                .collect(Collectors.toList());
    }
}





