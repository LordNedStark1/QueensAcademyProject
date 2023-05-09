package academy.queens.queensacademy.adminTest;

import academy.queens.queensacademy.dtos.requests.ApplicationRequest;
import academy.queens.queensacademy.dtos.response.ApplicationResponse;
import academy.queens.queensacademy.services.AdminService;
import academy.queens.queensacademy.services.QueensAcademyAdminService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdminServiceTest {
    AdminService adminService;
    @BeforeEach
    void setUp(){
        adminService = new QueensAcademyAdminService();

    }
    private ApplicationRequest mapApplicationRequest() {
        ApplicationRequest applicationRequest = new ApplicationRequest();
        applicationRequest.setEmail("testadmin@example.com");
        applicationRequest.setPassword("AdminPassword1@");
        applicationRequest.setFirstName("admin");
        applicationRequest.setLastName("Test");

        return applicationRequest;
    }
    @Test
    void testAdminCanRegister(){
        ApplicationResponse applicationResponse = adminService.registerAdmin(mapApplicationRequest());
        assertEquals(applicationResponse.getFirstName(), mapApplicationRequest().getFirstName());
        assertEquals(applicationResponse.getLastName(), mapApplicationRequest().getLastName());

    }
}
