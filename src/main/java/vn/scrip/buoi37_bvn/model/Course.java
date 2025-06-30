package vn.scrip.buoi37_bvn.model;

// model/Course.java
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class Course {
    private Integer id;
    private String name;
    private String description;
    private List<Integer> studentIds;
}
