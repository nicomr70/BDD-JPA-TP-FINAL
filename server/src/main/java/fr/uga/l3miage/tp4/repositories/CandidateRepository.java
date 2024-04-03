package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Set;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity, Long> {
    Set<CandidateEntity> findCandidateEntitiesByTestCenterContains(String code);
    Set<CandidateEntity> findAllByBirthDateBeforeAndHasExtraTimeFalse(LocalDate birthDate);
}
