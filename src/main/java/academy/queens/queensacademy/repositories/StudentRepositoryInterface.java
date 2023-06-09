package academy.queens.queensacademy.repositories;

import academy.queens.queensacademy.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositoryInterface extends MongoRepository<Student, String> {
}
