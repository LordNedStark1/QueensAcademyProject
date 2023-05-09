package academy.queens.queensacademy.services;

import academy.queens.queensacademy.dtos.requests.StudentApplicationRequest;

public interface AdminService {
    boolean verifyStudentApplication(StudentApplicationRequest studentApplicationRequest);
}
