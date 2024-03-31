package fr.uga.l3miage.tp4.repositories;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.uga.l3miage.tp4.models.CandidateEntity;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity, Long>{

    Set<CandidateEntity> findAllByExtraTimeFalseAndBirthDateBefore(LocalDate date);
    
}
