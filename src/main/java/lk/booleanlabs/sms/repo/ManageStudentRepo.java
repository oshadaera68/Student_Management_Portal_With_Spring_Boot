package lk.booleanlabs.sms.repo;

import lk.booleanlabs.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : oshadaera68
 * @since : 0.1.0
 **/
public interface ManageStudentRepo extends JpaRepository<Student,String> {
}
