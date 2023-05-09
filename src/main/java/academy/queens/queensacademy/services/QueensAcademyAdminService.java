package academy.queens.queensacademy.services;

import academy.queens.queensacademy.appUtils.Mapper;
import academy.queens.queensacademy.dtos.requests.ApplicationRequest;
import academy.queens.queensacademy.dtos.response.ApplicationResponse;
import academy.queens.queensacademy.models.Admin;
import academy.queens.queensacademy.models.User;
import academy.queens.queensacademy.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueensAcademyAdminService implements AdminService{

    @Autowired
    AdminRepository adminRepository;
    @Override
    public boolean verifyStudentApplication(ApplicationRequest studentApplicationRequest) {
        return true;
    }

    @Override
    public ApplicationResponse registerAdmin(ApplicationRequest applicationRequest) {
        Admin admin =  Mapper.map(applicationRequest);
        admin.setAdmin(true);
        User savedAdmin = adminRepository.save(admin);
        return Mapper.map(savedAdmin);
    }
}
