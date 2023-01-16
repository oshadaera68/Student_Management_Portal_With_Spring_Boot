package lk.booleanlabs.sms.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @author : oshadaera68
 * @since : 0.1.0
 **/
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cId;
    private String name;

    @OneToMany(mappedBy = "classes")
    private List<Instructors> insId;
    @OneToMany(mappedBy = "classes")
    private List<Student> studentList;
}