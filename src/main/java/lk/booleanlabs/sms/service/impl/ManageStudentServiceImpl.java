package lk.booleanlabs.sms.service.impl;

import lk.booleanlabs.sms.entity.Student;
import lk.booleanlabs.sms.repo.ManageStudentRepo;
import lk.booleanlabs.sms.service.ManageStudentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author : oshadaera68
 * @since : 0.1.0
 **/
@Service
@Transactional
public class ManageStudentServiceImpl implements ManageStudentService {

    @Autowired
    private ManageStudentRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<Student> getAllStudents() {
        return mapper.map(repo.findAll(), new TypeToken<List<Student>>() {
        }.getType());
    }
}
