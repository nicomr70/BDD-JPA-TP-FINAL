package fr.uga.l3miage.tp4.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.uga.l3miage.tp4.models.CandidateEntity;

import java.time.LocalDate;
import java.util.Set;

@Repository
public interface CandidateEntityRepository extends JpaRepository<CandidateEntity, Long> {
        Set<CandidateEntity> findByTestCenterCode(String code);
        
        Set<CandidateEntity> findByHasExtraTimeFalseAndBirthDateBefore(LocalDate date);

}
