package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.entity.Course;
import tn.esprit.spring.entity.Registration;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    Registration findByNumRegistration(Long numRegistration);
    @Query("select r from Registration r where r.numRegistration= :numRegistration")
    List<Registration> findPisteBynumRegistration(@Param("numRegistration") Long numRegistration);

    @Query("select r from Registration r where r.numWeek= :numWeek")
    List<Registration> findPisteBynumWeek(@Param("numWeek") int numWeek);
}
