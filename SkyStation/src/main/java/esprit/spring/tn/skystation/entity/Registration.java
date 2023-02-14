package esprit.spring.tn.skystation.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Registration")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRegistration")

    private Long numRegistration;
    private int numWeek;
    @ManyToOne
    private Course Course ;

    @ManyToOne
    private Skier Skier;
}
