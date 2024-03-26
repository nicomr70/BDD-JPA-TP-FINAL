package fr.uga.l3miage.tp4.components;

import java.util.Set;

import org.springframework.stereotype.Component;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.TestCenterRepository;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TestCenterComponent {
    private final TestCenterRepository testCenterRepository;

    // Retourne tous les candidats venant du centre GRE
    public Set<CandidateEntity> getCandidatesFromGRE(){
        return testCenterRepository.findCandidatesByTestCenterCode(TestCenterCode.GRE);
    }
}
