//Mục tiêu học được:
//
//  Cách viết mutation (@MutationMapping)
//  Cách viết field resolver (@SchemaMapping)
//  Hiểu cách GraphQL fetch data lồng nhau
//  Hiểu được use case khi nào dùng GraphQL thay REST
//
//Đề bài:
//Viết API GraphQL quản lý Course và Student:
//
//Schema:
//
//  type Course {
//      id: Int
//      name: String
//      description: String
//      students: [Student]
//  }
//
//  type Student {
//      id: Int
//      name: String
//      email: String
//  }
//
//  type Query {
//      allCourses: [Course]
//      courseById(id: Int): Course
//  }
//
//  type Mutation {
//      addStudentToCourse(courseId: Int, studentId: Int): Course
//  }
//Logic:
//Danh sách Course và Student có sẵn trong memory (Map hoặc List).
//Course có field students là danh sách Student.
//
//Query:
//
//  allCourses: trả về tất cả các khoá học.
//  courseById(id) → trả về 1 course và các sinh viên trong đó.
//
//Mutation:
//
//  addStudentToCourse(courseId, studentId) → thêm 1 sinh viên vào 1 course, return lại Course mới (có sinh viên đã thêm).
//Viết @SchemaMapping cho field Course.students để xử lý việc fetch data lồng nhau cho field students.

package vn.scrip.buoi37_bvn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Buoi37BvnApplication {
    public static void main(String[] args) {
        SpringApplication.run(Buoi37BvnApplication.class, args);
    }
}









