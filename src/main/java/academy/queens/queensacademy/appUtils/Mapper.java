package academy.queens.queensacademy.appUtils;

import academy.queens.queensacademy.dtos.requests.ApplicationRequest;
import academy.queens.queensacademy.dtos.response.ApplicationResponse;
import academy.queens.queensacademy.models.Admin;
import academy.queens.queensacademy.models.Student;
import academy.queens.queensacademy.models.User;

public class Mapper {

    public static Admin map(ApplicationRequest studentApplicationRequest) {
        return Admin.builder().firstName(studentApplicationRequest.getFirstName())
                .lastName(studentApplicationRequest.getLastName())
                .email(studentApplicationRequest.getEmail())
                .password(studentApplicationRequest.getPassword())
                .build();
    }
    public static ApplicationResponse map(User user){
        return ApplicationResponse.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .message("you have been admitted")
                .id(user.getUserId())
                .build();

    }
}
