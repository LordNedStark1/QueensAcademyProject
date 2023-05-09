package academy.queens.queensacademy.dtos.requests;

import lombok.Data;

@Data

public class ApplicationRequest {
    private String firstName;
    private String lastName;
    private String password;
    private String email;

}
