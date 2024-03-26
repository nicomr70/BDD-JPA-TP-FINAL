package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.TestCenterEntity;
import fr.uga.l3miage.tp4.repositories.TestCenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class TestCenterComponent {

    private final TestCenterRepository testCenterRepository;

    // Récupérer la liste des candidats du TestCenter ayant le code testCenterCode = 'GRE'
    public Set<CandidateEntity> getCandidatesByTestCenterCode(String testCenterCode) {
        TestCenterEntity testCenter = testCenterRepository.findByCode(testCenterCode); // besoin de faire testCenterCode = "GRE"
        if (testCenter != null) {
            return testCenter.getCandidates();
        }
        return Collections.emptySet();
    }
}

