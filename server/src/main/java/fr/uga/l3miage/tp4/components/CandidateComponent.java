package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.entities.CandidateEntity;
import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CandidateComponent {
    private final CandidateRepository candidateRepository;

    public CandidateEntity getCandidate(Long id){
        return candidateRepository.findById(id).orElseThrow();
    }

    public CandidateEntity createCandidate(CandidateEntity candidateEntity){
        return candidateRepository.save(candidateEntity);
    }

    public void deleteCandidate(Long id){
        candidateRepository.deleteById(id);
    }

    public CandidateEntity updateBirthDate(Long id, LocalDate newBirthDate){
        CandidateEntity candidateEntity = candidateRepository.findById(id).orElseThrow();
        candidateEntity.setBirthDate(newBirthDate);
        return candidateRepository.save(candidateEntity);
    }

    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return candidateRepository.findDistinctByCandidateEvaluationGridEntities_GradeLessThanEqual(5);
    }

    public Set<CandidateEntity>getCandidatsGrenoble(){
        return candidateRepository.findByTestCenterEntity_TestCenterCode(TestCenterCode.GRE);
    }

    public Set<CandidateEntity>getNoExtraTimeAndBirthDate(){
        LocalDate date = LocalDate.of(2000, 1, 1);
        return candidateRepository.findByHasExtraTimeFalseAndBirthDateAfter(date);
    }

    public Boolean hasEliminatoryGrade(CandidateEntity candidate) {
        return candidate.getCandidateEvaluationGridEntities().stream()
                .anyMatch(grid -> grid.getGrade() <= 5);
    }

    public Set<CandidateEntity> getAllEliminatedCandidates(){
        Set<CandidateEntity> AllCandidates= new HashSet<>(candidateRepository.findAll());
        return AllCandidates.stream().filter(this::hasEliminatoryGrade).collect(Collectors.toSet());}


}
