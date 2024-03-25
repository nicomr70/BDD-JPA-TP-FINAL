package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class CandidateComponent {

    private final CandidateRepository candidateRepository;

    public CandidateEntity getCandidate(long id){
        return candidateRepository.findById(id).orElseThrow();

    }

    public CandidateEntity createCandidate(CandidateEntity candidateEntity){
        return candidateRepository.save(candidateEntity);
    }

    public CandidateEntity updateCandidate(long id, CandidateEntity candidateEntity){
        CandidateEntity ancien = candidateRepository.findById(id).orElseThrow();
        ancien.setFirstname(candidateEntity.getFirstname());
        ancien.setLastname(candidateEntity.getLastname());
        ancien.setEmail(candidateEntity.getEmail());
        ancien.setPhoneNumber(candidateEntity.getPhoneNumber());
        ancien.setBirthDate(candidateEntity.getBirthDate());
        ancien.setHasExtraTime(candidateEntity.isHasExtraTime());
        return candidateRepository.save(ancien);

    }

    public void deleteCandidate(long id){
        candidateRepository.deleteById(id);
    }



    public Set<CandidateEntity> getAllEliminatedCandidate(){
        return null;
    }


}
