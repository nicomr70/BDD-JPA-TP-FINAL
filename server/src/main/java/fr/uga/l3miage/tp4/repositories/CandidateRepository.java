package fr.uga.l3miage.tp4.repositories;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Set;

@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity,Long> {

    //J'ai essayé avec cette méthode proposé par le système de nommage de Spring JPA mais il ne reconnait pas le nom 'Gre' donc j'ai opté pour la méthode ci-dessous.
     //Set<CandidateEntity> findAllByTestCenter_CodeGre();


    //Ou sinon une version plus générique en passant un TestCenterCode en paramètre et  on obtient la liste des candidats ayant ce code.
    Set<CandidateEntity> findAllByTestCenter_Code(TestCenterCode code);

    Set<CandidateEntity> findAllByBirthDateBeforeAndHasExtraTimeFalse(LocalDate date);
}
