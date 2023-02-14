package esprit.spring.tn.skystation.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Skier")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Skier implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSkier")

    private Long numSkier;
    private String firstName;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private String city;
    @ManyToMany
    private List<Piste> Pistes;

    @OneToMany(mappedBy = "Skier")
    private List<Registration> Registrations;
}
