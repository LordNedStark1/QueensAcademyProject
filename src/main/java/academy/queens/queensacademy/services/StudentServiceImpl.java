package academy.queens.queensacademy.services;

import academy.queens.queensacademy.appUtils.Mapper;
import academy.queens.queensacademy.dtos.response.StudentApplicationResponse;
import academy.queens.queensacademy.dtos.requests.StudentApplicationRequest;
import academy.queens.queensacademy.repositories.StudentRepositoryInterface;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentServiceInterface {
    @Autowired
    StudentRepositoryInterface studentRepositoryInterface ;
    @Autowired
    AdminService adminService;

    public StudentApplicationResponse studentApplication(StudentApplicationRequest studentApplicationRequest){
        boolean isVerified = adminService.verifyStudentApplication(studentApplicationRequest);
        if(isVerified) studentRepositoryInterface.save( Mapper.map(studentApplicationRequest));

        return null;
    }

}
