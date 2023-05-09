package academy.queens.queensacademy.services;

import academy.queens.queensacademy.dtos.requests.StudentApplicationRequest;

public class AdminServiceImpl implements AdminService{

    @Override
    public boolean verifyStudentApplication(StudentApplicationRequest studentApplicationRequest) {
        return true;
    }
}
