package lk.booleanlabs.sms.entity;

import lombok.*;

import javax.persistence.*;

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
public class Instructors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int insId;
    private String name;
    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "cId", insertable = false, updatable = false)
    private Classes classes;
}
