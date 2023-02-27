package tn.esprit.spring.SkiStation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"tn.esprit.spring.entity"})
@EnableJpaRepositories(basePackages = {"tn.esprit.spring.repositories"})
public class Tp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp1Application.class, args);
    }

}
