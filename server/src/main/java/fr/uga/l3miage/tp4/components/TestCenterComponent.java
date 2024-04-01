package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.EvaluationCriteriaEntity;
import fr.uga.l3miage.tp4.models.TestCenterEntity;
import fr.uga.l3miage.tp4.repositories.EvaluationCriteriaRepository;
import fr.uga.l3miage.tp4.repositories.TestCenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestCenterComponent {
    private final TestCenterRepository testCenterRepository;

    public TestCenterEntity getEcosSessionProgrammation(Long id){
        return testCenterRepository.findById(id).orElseThrow();

    }

    public TestCenterEntity createEcosSessionProgrammation(TestCenterEntity testCenterEntity){
        return testCenterRepository.save(testCenterEntity);
    }

    public TestCenterEntity updateEcosSessionProgrammation(Long id, TestCenterEntity testCenterEntity){
        TestCenterEntity ancien = testCenterRepository.findById(id).orElseThrow();
        ancien.setCode(testCenterEntity.getCode());
        ancien.setUniversity(testCenterEntity.getUniversity());
        ancien.setCity(testCenterEntity.getCity());
        return testCenterRepository.save(ancien);
    }

    public void deleteEcosSessionProgrammation(Long id){
        testCenterRepository.deleteById(id);
    }
}

