package fr.uga.l3miage.tp4.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.uga.l3miage.tp4.models.CandidateEntity;

import java.time.LocalDate;
import java.util.Set;

@Repository
public interface CandidateEntityRepository extends JpaRepository<CandidateEntity, Long> {
        //ilya une erreur ici qui empeche le projet de build du coup je lai mis en commentaire pour que le projet build

        //  Set<CandidateEntity> findByTestCenterCode(String code);

        Set<CandidateEntity> findByHasExtraTimeFalseAndBirthDateBefore(LocalDate date);

        Set<CandidateEntity> findByCandidateEvaluationGridEntitiesGradeLessThanEqual(double candidateEvaluationGridEntities_grade);


}
