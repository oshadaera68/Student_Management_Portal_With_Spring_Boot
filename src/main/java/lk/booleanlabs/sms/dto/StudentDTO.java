package lk.booleanlabs.sms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : oshadaera68
 * @since : 0.1.0
 **/
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private int sId;
    private String name;
    private String email;
    private String grade;
    private int gId;
    private int cId;
}
