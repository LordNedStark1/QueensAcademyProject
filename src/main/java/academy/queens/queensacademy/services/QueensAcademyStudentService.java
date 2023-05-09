package academy.queens.queensacademy.services;

import academy.queens.queensacademy.appUtils.Mapper;

import academy.queens.queensacademy.dtos.requests.ApplicationRequest;
import academy.queens.queensacademy.dtos.response.ApplicationResponse;
import academy.queens.queensacademy.models.Student;
import academy.queens.queensacademy.models.User;
import academy.queens.queensacademy.repositories.StudentRepositoryInterface;

import org.springframework.beans.factory.annotation.Autowired;

public class QueensAcademyStudentService implements StudentServiceInterface {
    @Autowired
    StudentRepositoryInterface studentRepositoryInterface ;
    @Autowired
    AdminService adminService;

    public ApplicationResponse studentApplication(ApplicationRequest studentApplicationRequest){
        boolean isVerified = adminService.verifyStudentApplication(studentApplicationRequest);
        ApplicationResponse response = new ApplicationResponse();
        if(isVerified) {
            User student =  Mapper.map(studentApplicationRequest);
//            student.setStudent(true);
            Student savedStudent = studentRepositoryInterface.save((Student) student);
            response = Mapper.map(savedStudent);
        }

        return response;
    }

}
