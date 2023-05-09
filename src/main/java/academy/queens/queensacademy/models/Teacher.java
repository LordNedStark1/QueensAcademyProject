package academy.queens.queensacademy.models;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Teacher {

    private String id;
    private String name;
    private String email;
    private String password;

}
