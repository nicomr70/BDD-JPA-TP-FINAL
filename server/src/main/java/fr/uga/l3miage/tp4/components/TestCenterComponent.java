package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.TestCenterEntity;
import fr.uga.l3miage.tp4.repositories.TestCenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class TestCenterComponent {
    private TestCenterRepository testCenterRepository;

    public Set<TestCenterEntity> getAllTestCenterByCode(TestCenterCode code){
        Set<TestCenterEntity> tests = testCenterRepository.findAllByCode(code);
        return tests.forEach((val)=>val.get);
    }

}
