package tn.esprit.spring.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table( name ="Subscription")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSub;
    private Date startDate;
    private Date endDate;
    private Float price;
    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSub;


}
