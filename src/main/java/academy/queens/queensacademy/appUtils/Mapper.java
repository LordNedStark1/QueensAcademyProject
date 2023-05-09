package academy.queens.queensacademy.appUtils;

import academy.queens.queensacademy.dtos.requests.StudentApplicationRequest;
import academy.queens.queensacademy.models.Student;

public class Mapper {

    public static Student map(StudentApplicationRequest studentApplicationRequest) {
        Student student = Student.builder().studentName(studentApplicationRequest.getStudentName())
                .email(studentApplicationRequest.getEmail())
                .password(studentApplicationRequest.getPassword())
                .build();
        return student;
    }
}
