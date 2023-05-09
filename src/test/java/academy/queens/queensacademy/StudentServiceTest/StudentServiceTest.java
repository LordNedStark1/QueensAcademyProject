package academy.queens.queensacademy.StudentServiceTest;

import academy.queens.queensacademy.dtos.StudentApplicationRequest;
import academy.queens.queensacademy.services.StudentServiceImpl;
import academy.queens.queensacademy.services.StudentServiceInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceTest {

    private StudentServiceInterface studentServiceInterface ;
    private StudentApplicationRequest studentApplicationRequest;
    @BeforeEach
    private void setup() {
        studentServiceInterface = new StudentServiceImpl();
        studentApplicationRequest = new StudentApplicationRequest();
    }
    @Test
    public void testStudentCanApply(){
        studentServiceInterface.apply()
    }
}
