package lk.booleanlabs.sms.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : oshadaera68
 * @since : 0.1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ResponseUtil {
    private int code;
    private String message;
    private Object data;
}
