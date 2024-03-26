package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository

public interface CandidateRepository extends JpaRepository<CandidateEntity,Long> {
    //Récupérer les candidats qui ont eu au moins 1 note éliminatoire (<=5)
    // (fonction nommée)
    Set<CandidateEntity> findByEliminatoryScoreLessThanEqualFive();

    //Récupérer les candidats qui n'ont pas de temps additionnel et qui sont nés avant le 01/01/2000(fonction nommée)
    Set<CandidateEntity> findByAdditionalTimeIsNullAndBirthDateBefore(String date);
}
