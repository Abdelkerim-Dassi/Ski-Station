package tn.esprit.spring.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;



// we can add @Getter and @Setter to avoid writing all the getters and setters
@Getter
@Setter
@Entity
@Table( name ="Etudiant")

public class Etudiant implements Serializable {
    //primaryKey
    @Id
    //another strategy     @GeneratedValue (strategy = AUTO)
    //we need to define hibernate_sequence{50,51,98,23} each table of the database will have
    //a value from this sequence (we have no duplicate id values in the whole database)
    /////////////////
    //@GeneratedValue (strategy = TABLE): also use the hibernate_sequence per table
    //first table has  then and table
    // auto increment has  then
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;


    @ManyToOne
    private Department dept;
    //when we add the annotation @Transient if we add an attribute in the project and we don't want it
    //to be added in the database


    // when we have attribute having Date type we have to add annotation @Temporal(TemporalType.DATE)

// Constructeur et accesseurs (getters) et mutateurs (setters)


    public Etudiant() {
    }


}