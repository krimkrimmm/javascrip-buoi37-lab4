// model/Student.java
package vn.scrip.buoi37_bvn.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String email;
}
