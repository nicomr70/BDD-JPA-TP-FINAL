package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.CandidateEvaluationGridEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;


@Repository
public interface CandidateEvaluationGridRepository extends JpaRepository<CandidateEvaluationGridEntity,String> {

    // partie de Récupérer les candidats qui ont eu au moins 1 note éliminatoire (<=5) (fonction nommée + CandidateComponent)
    public Set<CandidateEvaluationGridEntity> findAllByGradeIsLessThan(Double grade);
}