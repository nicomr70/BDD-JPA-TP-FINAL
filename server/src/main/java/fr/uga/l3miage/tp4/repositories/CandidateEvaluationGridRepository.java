package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.CandidateEvaluationGridEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CandidateEvaluationGridRepository extends JpaRepository<CandidateEvaluationGridEntity, Long> {
    public Set<CandidateEntity> findAllByGradeIsLessThanEqual(double grade);
}
