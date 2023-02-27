package tn.esprit.spring.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table( name ="Instructor")

public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInstructor;
    private String firstName;
    private String lastName;
    private Date DateOfHire;

    @OneToMany
    private List<Course> courses;
}
