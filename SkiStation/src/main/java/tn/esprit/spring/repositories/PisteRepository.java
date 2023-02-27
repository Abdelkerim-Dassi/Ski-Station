package tn.esprit.spring.repositories;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.Color;
import tn.esprit.spring.entity.Course;
import tn.esprit.spring.entity.Piste;

import java.util.List;
import java.util.function.Function;

@Repository
public interface PisteRepository extends JpaRepository<Piste, Long> {
    Piste findByColorAndSlope(Color color,int slope);
    Piste findByNamePiste(String namePiste);
    Piste findByNumPiste(long numPiste);
    @Query("SELECT p from Piste p WHERE p.numPiste = :numPiste")
    List<Piste> findPisteBynumPiste(@Param("numPiste") Long numPiste);

    @Query("SELECT p from Piste p WHERE p.length = :length")
    List<Piste> findPisteBylength(@Param("length") Integer length);


}
