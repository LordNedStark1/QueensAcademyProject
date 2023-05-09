package academy.queens.queensacademy.dtos.requests;

import lombok.Data;

@Data

public class StudentApplicationRequest {
    private String studentName;
    private String password;
    private String email;
}
