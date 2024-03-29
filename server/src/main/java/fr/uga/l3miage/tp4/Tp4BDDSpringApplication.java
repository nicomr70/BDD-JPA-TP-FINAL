package fr.uga.l3miage.tp4;

import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import fr.uga.l3miage.tp4.repositories.ExamRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Correspond au main de l'application et donc ce qui va la lancer
 * Les Annotations :
 * <ul>
 *     <li>{@link SpringBootApplication} permet de dire à spring que cette classe est le run de l'application</li>
 * </ul>
 */
@SpringBootApplication
public class Tp4BDDSpringApplication {


    public static void main(String[] args) {

        SpringApplication.run(Tp4BDDSpringApplication.class,args);
    }
}
