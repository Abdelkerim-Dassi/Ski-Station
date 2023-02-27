package tn.esprit.spring.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table( name ="Course")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCourse;
    private int level;
    @Enumerated(EnumType.STRING)
    private TypeCourse typeCourse;

    private Support support;
    private Float price;
    private int timeSlot;

    @OneToMany(mappedBy = "course")
    private List<Registration> registrations;

}
