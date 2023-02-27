package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.entity.Course;
import tn.esprit.spring.entity.Subscription;

import java.util.Date;
import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    Subscription findByEndDate(Date endDate);
    Subscription findByStartDate(Date StartDate);
    @Query("Select s from Subscription s where s.numSub=:numSub")
    List<Subscription> findSubscriptionByNumSub(@Param("numSub") Long numSub);

    @Query("select s from Subscription s where s.price=:price")
    List<Subscription> findSubscriptionByprice(@Param("price") Float price);
}
