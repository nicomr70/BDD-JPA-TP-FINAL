package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Set;

@Repository
public interface CandidateEntityRepository extends JpaRepository<CandidateEntity,Long> {

        Set<CandidateEntity> findAllByTestCenterEntity_Code(TestCenterCode gre);

        Set<CandidateEntity> findAllByHasExtraTimeFalseAndBirthDateBefore(LocalDate of);
}