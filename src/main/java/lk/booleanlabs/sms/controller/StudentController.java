package lk.booleanlabs.sms.controller;

import lk.booleanlabs.sms.dto.StudentDTO;
import lk.booleanlabs.sms.service.ClassService;
import lk.booleanlabs.sms.service.StudentService;
import lk.booleanlabs.sms.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : oshadaera68
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("student")
@CrossOrigin
public class StudentController {
    @Autowired
    StudentService studentService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveStudent(@ModelAttribute StudentDTO dto) {
        studentService.saveStudent(dto);
        return new ResponseUtil(200,"Save",null);
    }
}
