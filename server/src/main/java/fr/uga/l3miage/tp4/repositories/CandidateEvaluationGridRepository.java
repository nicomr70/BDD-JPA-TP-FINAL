package fr.uga.l3miage.tp4.repositories;


import fr.uga.l3miage.tp4.models.CandidateEvaluationGridEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CandidateEvaluationGridRepository extends JpaRepository<CandidateEvaluationGridEntity, Long> {

//R3
    Set<CandidateEvaluationGridEntity> findByGradeLessThanEqual(double grade);
}

