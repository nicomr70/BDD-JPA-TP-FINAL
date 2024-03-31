package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Set;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity, Long> {

    // Récupérer la liste des candidats du TestCenter ayant le code 'GRE' (fonction nommée)
    public Set<CandidateEntity> findAllByTestCenter_Code(TestCenterCode code);

    // Récupérer les candidats qui ont eu au moins 1 note éliminatoire (<=5) (fonction nommée + CandidateComponent)
    public Set<CandidateEntity> findByCandidateEvaluationGrids_GradeLessThanEqual(double grade);

    // Récupérer les candidats qui n'ont pas de temps additionnel et qui sont nés avant le 01/01/2000(fonction nommée)
    public Set<CandidateEntity> findAllByHasExtraTimeFalseAndBirthDateBefore(LocalDate date);
}
