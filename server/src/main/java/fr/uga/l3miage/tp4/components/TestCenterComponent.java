package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.entities.CandidateEntity;
import fr.uga.l3miage.tp4.entities.TestCenterEntity;
import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.repositories.TestCenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class TestCenterComponent {
    private final TestCenterRepository testCenterRepository;

    public TestCenterEntity getTestCenter(Long id){
        return testCenterRepository.findById(id).orElseThrow();
    }

    public TestCenterEntity createTestCenter(TestCenterEntity testCenterEntity){
        return testCenterRepository.save(testCenterEntity);
    }

    public void deleteTestCenter(Long id){
        testCenterRepository.deleteById(id);
    }

    public TestCenterEntity updateCity(Long id, String newCity){
        TestCenterEntity testCenterEntity = testCenterRepository.findById(id).orElseThrow();
        testCenterEntity.setCity(newCity);
        return testCenterRepository.save(testCenterEntity);
    }


}
