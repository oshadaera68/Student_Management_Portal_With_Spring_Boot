package lk.booleanlabs.sms.controller;

import lk.booleanlabs.sms.service.ManageStudentService;
import lk.booleanlabs.sms.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : oshadaera68
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("manage")
@CrossOrigin
public class ManageStudentController {
    @Autowired
    ManageStudentService studentService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllStudents() {
        return new ResponseUtil(200, "All Students", studentService.getAllStudents());
    }
}
