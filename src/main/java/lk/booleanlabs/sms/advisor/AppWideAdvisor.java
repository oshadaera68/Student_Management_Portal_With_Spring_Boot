package lk.booleanlabs.sms.advisor;

import lk.booleanlabs.sms.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : oshadaera68
 * @since : 0.1.0
 **/
@RestControllerAdvice
@CrossOrigin
public class AppWideAdvisor {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({Exception.class})
    public ResponseUtil exceptionHandler(Exception e) {
        return new ResponseUtil(500, e.getMessage(), null);
    }
}
