package fr.uga.l3miage.tp4.repositorys;
import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.CandidateEvaluationGridEntity;
import fr.uga.l3miage.tp4.models.TestCenterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;


import java.time.LocalDate;
import java.util.Set;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity, Long> {
    Set<TestCenterEntity> findAllByCodeEquals(TestCenterCode GRE);
    Set<CandidateEntity> findAllByGradeLessThanEqual(double grade);
    Set<CandidateEntity> findAllByHasExtraTimeFalseAndBirthDateBefore(LocalDate date);



}
