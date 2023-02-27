package tn.esprit.spring.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDepart;
    private String nomDepart;

    @OneToMany(mappedBy = "dept")
    private List<Etudiant> etudiants;
    public Department() {
    }
}
