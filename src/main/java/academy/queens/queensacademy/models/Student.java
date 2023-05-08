package academy.queens.queensacademy.models;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Student {
    @Id
    private String studentId;
    private String studentName;
    private String password;
    private String email;
    private List<String> reportSheetIds = new ArrayList<>();

}
