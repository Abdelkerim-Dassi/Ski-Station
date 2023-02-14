package esprit.spring.tn.skystation.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Instractor")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Instructor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInstractor")

    private Long numInstractor;
    private String FirstName;
    private String LastName;
    @Temporal(TemporalType.DATE)
    private Date dateOfHire;

    @OneToMany
    private List<Course> Courses;
}
