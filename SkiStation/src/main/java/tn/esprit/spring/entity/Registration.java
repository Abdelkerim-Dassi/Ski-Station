package tn.esprit.spring.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numRegistration;

    private int numWeek;

    @ManyToOne
    private Skier skier;

    @ManyToOne
    private Course course;
}
