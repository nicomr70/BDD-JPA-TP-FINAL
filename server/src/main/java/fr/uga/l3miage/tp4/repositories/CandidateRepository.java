package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity,Long> {
    Set<CandidateEntity> findCandidateEntitiesByTestCenterCode(TestCenterCode centerCode);
    Set<CandidateEntity> findByEvaluationGridsGradeLessThan(double grade);
    Set<CandidateEntity> findByHasExtraTimeFalseAndBirthDateBefore(LocalDate date);
}
