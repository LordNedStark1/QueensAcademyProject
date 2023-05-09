package academy.queens.queensacademy.dtos.response;

import lombok.*;

@Data
@Builder
@AllArgsConstructor

@RequiredArgsConstructor
public class ApplicationResponse {
    private String id;
    private String firstName;
    private String lastName;
    private String message;
}
