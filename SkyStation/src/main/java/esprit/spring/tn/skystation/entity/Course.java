package esprit.spring.tn.skystation.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Course")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCourse")

    private Long numCourse;
    private int level;
    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float price;
    private int timeSlot;
     @ManyToOne
     private  Registration registration;

    @OneToMany(mappedBy = "Course")
    private Set<Registration> Registrations;



}
