package tn.esprit.spring.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.entity.Course;
import tn.esprit.spring.entity.Skier;

import java.util.List;

public interface SkierRepository extends JpaRepository<Skier, Long> {
    Skier findByFirstName(String FirstName);
    Skier findByCity(String city);

    @Query("Select s from Skier s where s.numSkier= :numSkier")
     List<Skier> findSkierBynumSkier(@Param("numSkier") Long numSkier);

    @Query("Select s from Skier s where s.firstName= :firstName")
    List<Skier> findSkierBynumSkier(@Param("firstName") String firstName);

}
