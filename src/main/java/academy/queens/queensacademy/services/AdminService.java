package academy.queens.queensacademy.services;

import academy.queens.queensacademy.dtos.requests.ApplicationRequest;
import academy.queens.queensacademy.dtos.response.ApplicationResponse;

public interface AdminService {
    boolean verifyStudentApplication(ApplicationRequest studentApplicationRequest);

    ApplicationResponse registerAdmin(ApplicationRequest mapApplicationRequest);
}
