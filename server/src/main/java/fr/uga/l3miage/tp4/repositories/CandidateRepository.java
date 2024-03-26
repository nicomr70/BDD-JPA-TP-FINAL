package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.entities.CandidateEntity;
import fr.uga.l3miage.tp4.enums.TestCenterCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity,Long> {
    Set<CandidateEntity> findDistinctByCandidateEvaluationGridEntities_GradeLessThanEqual(double grade);
    Set <CandidateEntity> findByTestCenterEntity_TestCenterCode(TestCenterCode code);
}
