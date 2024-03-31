package fr.uga.l3miage.tp4.repositories;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.CandidateEvaluationGridEntity;

@Repository
public interface CandidateEvaluationGridRepository extends JpaRepository<CandidateEvaluationGridEntity, Long>{
    public Set<CandidateEntity> findAllByGradeLessThan(double grade);
}
