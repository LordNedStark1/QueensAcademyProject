package academy.queens.queensacademy.models;

import lombok.*;

@Data
@Builder
@AllArgsConstructor

@RequiredArgsConstructor
public class Admin extends User {
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    private boolean isAdmin;
}
