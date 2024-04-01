package fr.uga.l3miage.tp4.repositories;
import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity, Long> {

    //Récupérer la liste des candidats du TestCenter ayant le code 'GRE'
    Set<CandidateEntity> findByTestCenterEntityCode(TestCenterCode code);

    //Récupérer les candidats qui ont eu au moins 1 note éliminatoire (<=5)
    Set<CandidateEntity> findByCandidateEvaluationGridEntitiesGradeLessThanEqual(double grade);


    //Récupérer les candidats qui n'ont pas de temps additionnel et qui sont nés avant le 01/01/2000
    Set<CandidateEntity> findByHasExtraTimeFalseAndBirthDateBefore(LocalDate date);




}

