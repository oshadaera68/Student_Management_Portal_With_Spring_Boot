package lk.booleanlabs.sms.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @author : oshadaera68
 * @since : 0.1.0
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int gId;
    private String grade;
    @OneToMany(mappedBy = "grade")
    private List<Student> studentList;
}
