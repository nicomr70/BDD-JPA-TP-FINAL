package fr.uga.l3miage.tp4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateEvaluationGridRepository extends JpaRepository<CandidateEvaluationGridEntity, Long> {
}
