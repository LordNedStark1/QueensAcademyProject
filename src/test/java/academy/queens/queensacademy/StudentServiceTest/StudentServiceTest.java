package academy.queens.queensacademy.StudentServiceTest;


import academy.queens.queensacademy.dtos.requests.ApplicationRequest;
import academy.queens.queensacademy.dtos.response.ApplicationResponse;
import academy.queens.queensacademy.models.Admin;
import academy.queens.queensacademy.services.QueensAcademyStudentService;
import academy.queens.queensacademy.services.StudentServiceInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
;


public class StudentServiceTest {

    private StudentServiceInterface studentServiceInterface ;
    private ApplicationRequest studentApplicationRequest;
    private Admin admin ;
    @BeforeEach
    private void setup() {
        studentServiceInterface =new QueensAcademyStudentService();
        studentApplicationRequest =  mapApplicationRequest();
        admin = new Admin();
        admin.setAdmin(true);
    }

    private ApplicationRequest mapApplicationRequest() {
        ApplicationRequest applicationRequest = new ApplicationRequest();
        applicationRequest.setEmail("test@example.com");
        applicationRequest.setPassword("Password1@");
        applicationRequest.setFirstName("student");
        applicationRequest.setLastName("Test");

        return applicationRequest;
    }

    @Test
    public void testStudentCanApply(){
       ApplicationResponse response = studentServiceInterface.studentApplication(studentApplicationRequest);


    }
}
