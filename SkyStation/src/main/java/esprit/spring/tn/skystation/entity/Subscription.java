package esprit.spring.tn.skystation.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Subscription")
@Getter
@Setter
@ToString
@EqualsAndHashCode
//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Subscription implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSubscription")

    private Long numSub;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    private Float price;
    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSub;

    @OneToOne
    private  Skier skier;

}
