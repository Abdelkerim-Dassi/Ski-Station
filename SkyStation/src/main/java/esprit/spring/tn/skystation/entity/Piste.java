package esprit.spring.tn.skystation.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Piste")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPiste")

    private Integer idPiste;
    private Long numPiste;
    @Enumerated(EnumType.STRING)
    private Color color;
    private Integer length;
    private Integer slope;
    @ManyToMany(mappedBy = "Pistes")
    private List<Skier> Skiers ;

}
