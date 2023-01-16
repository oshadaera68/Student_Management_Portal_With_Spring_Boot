package lk.booleanlabs.sms.controller;

import lk.booleanlabs.sms.dto.ClassDTO;
import lk.booleanlabs.sms.entity.Classes;
import lk.booleanlabs.sms.service.ClassService;
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
@RequestMapping("class")
@CrossOrigin
public class ClassController {
    @Autowired
    ClassService classService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveClass(@ModelAttribute ClassDTO classes) {
        classService.saveClass(classes);
        return new ResponseUtil(200,"Save",null);
    }
}
