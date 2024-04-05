package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Set;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity, LocalDate> {
        Set<CandidateEntity> findByExamScore(int score);

        Set<CandidateEntity> findByExtraTime(LocalDate date);

}
