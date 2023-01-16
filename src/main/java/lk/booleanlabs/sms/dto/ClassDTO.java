package lk.booleanlabs.sms.dto;

import lombok.*;

/**
 * @author : oshadaera68
 * @since : 0.1.0
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ClassDTO {
    private int cId;
    private String name;
    private String instructor;
    private int sId;
}
