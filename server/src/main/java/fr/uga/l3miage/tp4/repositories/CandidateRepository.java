package fr.uga.l3miage.tp4.repositories;


import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface CandidateRepository extends JpaRepository<CandidateEntity, Long> {

        //R2
        Set<CandidateEntity> findAllByTestCenterEntityCode(TestCenterCode code);


        //R4
        Set<CandidateEntity> findByHasExtraTimeFalseAndBirthDateBefore(LocalDate date);


}