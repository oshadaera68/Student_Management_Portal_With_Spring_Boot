package lk.booleanlabs.sms.service.impl;

import lk.booleanlabs.sms.dto.StudentDTO;
import lk.booleanlabs.sms.entity.Student;
import lk.booleanlabs.sms.repo.StudentRepo;
import lk.booleanlabs.sms.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author : oshadaera68
 * @since : 0.1.0
 **/
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveStudent(StudentDTO dto) {
        if (!repo.existsById(String.valueOf(dto.getSId()))) {
            repo.save(mapper.map(dto, Student.class));
        } else {
            throw new RuntimeException("Student is Already Exist...!");
        }
    }
}
