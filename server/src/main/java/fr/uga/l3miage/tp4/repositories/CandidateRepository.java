package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Repository
public interface CandidateRepository extends UserRepository<CandidateEntity>{

Set<CandidateEntity> getAllEliminatedCandidate();
    Set<CandidateEntity> findAllByHasExtraTimeIsFalseAndBirthDateBefore(LocalDateTime birthDate);


}
