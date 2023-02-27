package tn.esprit.spring.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entity.Course;
import tn.esprit.spring.entity.Support;
import tn.esprit.spring.entity.TypeCourse;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByNumCourse(long numCourse);

    Course findByLevel(int level);
    Course findBySupport(Support support);
    @Query("SELECT C FROM Course c WHERE c.typeCourse = :type")
    List<Course> findCourseByTypeCourse(@Param("type")TypeCourse type);
}
