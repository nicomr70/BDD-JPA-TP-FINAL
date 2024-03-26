package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.TestCenterEntity;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindHandlerAdvisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Set;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity, Long> {
    // Cette méthode récupère tous les candidats qui n'ont pas de temps supplementaire
    // et dont la date de naissance est avant la date spécifiée
    Set<CandidateEntity> findAllByHasExtraTimeFalseAndBirthDateBefore(LocalDate date);
    // Cette méthode récupère tous les candidats ayant passé le test avec le code donnee
    Set<CandidateEntity> findAllByTestCenterEntity_Code(TestCenterCode code);

}
