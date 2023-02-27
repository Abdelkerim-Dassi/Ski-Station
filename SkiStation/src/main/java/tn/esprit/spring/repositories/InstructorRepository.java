package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.entity.Course;
import tn.esprit.spring.entity.Instructor;

import java.util.List;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    Instructor findByNumInstructor(Long numInstructor);

    @Query("select i from Instructor i where i.firstName= :firstName")
    List<Instructor> findByFirstName(@Param("firstName") String firstName) ;

    @Query("select i from Instructor i where i.lastName= :lastname")
    List<Instructor> findByLastName(@Param("lastname") String lastname) ;
}
