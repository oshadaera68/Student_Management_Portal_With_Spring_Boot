package lk.booleanlabs.sms.service.impl;

import lk.booleanlabs.sms.dto.ClassDTO;
import lk.booleanlabs.sms.entity.Classes;
import lk.booleanlabs.sms.repo.ClassRepo;
import lk.booleanlabs.sms.service.ClassService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : oshadaera68
 * @since : 0.1.0
 **/
@Service
@Transactional
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveClass(ClassDTO dto) {
        if(!repo.existsById(String.valueOf(dto.getCId()))){
            repo.save(mapper.map(dto, Classes.class));
        } else {
            throw new RuntimeException("Admin is Already Exist...!");
        }
    }
}
