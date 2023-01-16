package lk.booleanlabs.sms.repo;
import lk.booleanlabs.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, String> {
}
