package academy.queens.queensacademy.repositories;

import academy.queens.queensacademy.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepositoryInterface extends MongoRepository<Student, String> {
}
