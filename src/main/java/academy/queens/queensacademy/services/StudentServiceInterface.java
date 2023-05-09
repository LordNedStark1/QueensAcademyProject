package academy.queens.queensacademy.services;

import academy.queens.queensacademy.dtos.requests.StudentApplicationRequest;
import academy.queens.queensacademy.dtos.response.StudentApplicationResponse;

public interface StudentServiceInterface {
    public StudentApplicationResponse studentApplication(StudentApplicationRequest studentApplicationRequest);
}
