package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    private CandidateRepository candidateRepository;

    /*  Cette méthode est implémentée dans le component au lieu d'utiliser le principe d'interpollation de nom de fonction
   car JPA  ne peut pas filtrer le Set de CandidatEvaluationGrid sur l'attribut grade de l'entité car la relation entre CandidateEntity et CandidateEvaluationGridEntity est @OneToMany (bidirectionnelle)
   [evaluationGrids est une relation @OneToMany]
    * */
    public Set<CandidateEntity> getAllEliminatedCandidate(){
        Set<CandidateEntity> AllCandidates= new HashSet<>(candidateRepository.findAll());
        return AllCandidates.stream().filter(this::hasEliminatoryGrade).collect(Collectors.toSet());
    }



    //Renvoie vrai si le candidat a au moins une note éliminatoire, false sinon.
    private boolean hasEliminatoryGrade(CandidateEntity candidate) {
        return candidate.getEvaluationGrids().stream()
                .anyMatch(grid -> grid.getGrade() <= 5);
    }

    //REMARQUE: Si on veut utiliser une fonction de nommage de Spring Data JPA, il faut opter pour une autre modélisation pour permettre à JPA de faire le filtrage.



    /*Ici la date est sauvegardée en dur car il nous est donné une date précise pour l'exercice mais pour rendre cette méthode générique on peut rajouter un
    paramètre date de type LocalDate pour cette méthode et on renvoie les candidats nés avant cette date qui n'ont pas de temps additionnel.
    * */
    public Set<CandidateEntity> getAllCandidatesWithNoExtraTimeBornBefore_01_01_2001(){
        LocalDate date= LocalDate.of(2000,1,1);
        return candidateRepository.findAllByBirthDateBeforeAndHasExtraTimeFalse(date);
    }
}
