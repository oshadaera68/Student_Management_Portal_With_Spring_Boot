package lk.booleanlabs.sms.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

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
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sId;
    private String sName;
    private String email;
    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "cId", insertable = false, updatable = false)
    @JsonIgnore
    private Classes classes;
    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "gId", insertable = false, updatable = false)
    @JsonIgnore
    private Grade grade;
}
