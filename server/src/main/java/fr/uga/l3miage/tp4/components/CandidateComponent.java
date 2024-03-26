package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    private CandidateEntityRepository candidateEntityRepository;
 // je n'ai pas pu resoudre l'erreur qui empeche le projet de build du coup j'ai mis en commentaire pour que le projet build
 //   public Set<CandidateEntity> getCandidatesByTestCenterCodeGRE() {
       // return candidateEntityRepository.findByTestCenterCode("GRE");
  //  }

    public Set<CandidateEntity> getCandidatesWithoutExtraTimeBornBefore2000() {
        return candidateEntityRepository.findByHasExtraTimeFalseAndBirthDateBefore(LocalDate.of(2000, 1, 1));
    }

    public Set<CandidateEntity> getCandidateEvaluationGridEntitiesGradeLessThanEqual5() {
        return candidateEntityRepository.findByCandidateEvaluationGridEntitiesGradeLessThanEqual(5);
    }

}
