package academy.queens.queensacademy.models;

import lombok.*;

@Data
@Builder
@AllArgsConstructor

@RequiredArgsConstructor
public class User {
    private String userId;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
}
