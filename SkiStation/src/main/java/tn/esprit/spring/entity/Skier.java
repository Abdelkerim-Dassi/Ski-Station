package tn.esprit.spring.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table( name ="Skier")

public class Skier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkier;
    private String firstName;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private String city;
    @ManyToMany()
    private List<Piste> pistes;

    @OneToOne
    private Subscription numSub;

    @OneToMany(mappedBy = "skier")
    private List<Registration> registrations;

}
