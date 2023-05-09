package academy.queens.queensacademy.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Document
@AllArgsConstructor
@Builder
public class Student {

    private String studentId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private List<String> reportSheetIds = new ArrayList<>();

}
