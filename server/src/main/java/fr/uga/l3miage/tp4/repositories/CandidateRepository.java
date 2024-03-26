package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.CandidateEvaluationGridEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Set;


@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity,String> {

    //Récupérer les candidats qui n'ont pas de temps additionnel et qui sont nés avant le 01/01/2000(fonction nommée)
    //findAllByHasExtraTimeEqualsAndBirthDateBefore(false, 01/01/2000);
    public Set<CandidateEntity> findAllByHasExtraTimeEqualsAndBirthDateBefore(Boolean hasExtraTime, LocalDate birthDate);

    //Récupérer la liste des candidats du TestCenter ayant le code 'GRE' (fonction nommée)
    //findAllByEstRattachéA_Code("GRE")
    public Set<CandidateEntity> findAllByEstRattacheA_Code(TestCenterCode estRattacheA_code);

    //partie de Récupérer les candidats qui ont eu au moins 1 note éliminatoire (<=5) (fonction nommée + CandidateComponent)
    public Set<CandidateEntity> findAllByaPourGrillesEvaluationsContaining(Set<CandidateEvaluationGridEntity> aPourGrillesEvaluations);
}