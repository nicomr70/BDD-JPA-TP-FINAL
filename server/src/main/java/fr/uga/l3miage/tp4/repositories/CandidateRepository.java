package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Set;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity, Long> {

    // Récupérer la liste des candidats du TestCenter ayant le code "code" (fonction nommée)
    Set<CandidateEntity> findAllByTestCenterCode(String code);
    //Récupérer les candidats qui ont eu au moins 1 note moins de gradeMin
    //Set<CandidateEntity> findAllByGradeLessThanEqual(Double gradeMin);

    //Récupérer les candidats qui n'ont pas de temps additionnel et qui sont nés avant le 01/01/2000 (fonction nommée)
    Set<CandidateEntity> findAllByHasExtraTimeFalseAndBirthDateBefore(LocalDate birthDate); // on appelle la méthode avec birthdate = "01/01/2000"
}
