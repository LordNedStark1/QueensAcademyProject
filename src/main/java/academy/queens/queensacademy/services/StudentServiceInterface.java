package academy.queens.queensacademy.services;

import academy.queens.queensacademy.dtos.requests.ApplicationRequest;
import academy.queens.queensacademy.dtos.response.ApplicationResponse;

public interface StudentServiceInterface {
    public ApplicationResponse studentApplication(ApplicationRequest studentApplicationRequest);
}
