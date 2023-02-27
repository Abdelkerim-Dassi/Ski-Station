package tn.esprit.spring.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table( name ="Piste")

public class Piste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String namePiste;
    @Enumerated(EnumType.STRING)
    private Color color;

    private int length;
    private int slope;

    @ManyToMany(mappedBy = "pistes")
    private List<Skier> skiers;


}
