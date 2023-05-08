package academy.queens.queensacademy.models;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Teacher {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;

}
