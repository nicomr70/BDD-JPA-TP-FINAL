package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class CandidateComponent {
private  final CandidateRepository candidateRepository;
public Set<CandidateEntity> getCandidateTestCenter(TestCenterCode code){
    return  candidateRepository.findAllByTestCenter_Code(TestCenterCode.GRE);
}
    /* TODO à implémenter
    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return null;
    }
    */

}
