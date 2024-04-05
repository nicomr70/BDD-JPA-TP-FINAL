package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.models.ExamEntity;
import fr.uga.l3miage.tp4.models.TestCenterEntity;
import fr.uga.l3miage.tp4.repositories.TestCenterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import fr.uga.l3miage.tp4.enums.TestCenterCode;

import java.time.LocalDateTime;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class TestCenterComponent {
    private final TestCenterRepository testCenterRepository;

    public TestCenterEntity getTestCenterEntity(Long id){ // récupérer par son id

        return testCenterRepository.findById(id).orElseThrow();
    }

    // Create
    public TestCenterEntity createTestCenterEntity(){
        TestCenterEntity testCenterEntity = TestCenterEntity
                .builder()
                .id(1L)
                .code(TestCenterCode.GRE)
                .university("UGA")
                .city("Grenoble")
                .build();
        return testCenterRepository.save(testCenterEntity);
    }


    // update
    public TestCenterEntity updateCode(Long id,TestCenterCode code){
        TestCenterEntity testCenterEntity = testCenterRepository.findById(id).orElseThrow();
        testCenterEntity.setCode(code);
        return testCenterRepository.save(testCenterEntity);
    }

    public TestCenterEntity updateUniversity(Long id,String university){
        TestCenterEntity testCenterEntity = testCenterRepository.findById(id).orElseThrow();
        testCenterEntity.setUniversity(university);
        return testCenterRepository.save(testCenterEntity);
    }

    public TestCenterEntity updateCity(Long id,String city){
        TestCenterEntity testCenterEntity = testCenterRepository.findById(id).orElseThrow();
        testCenterEntity.setCity(city);
        return testCenterRepository.save(testCenterEntity);
    }


    public void deleteCenterEntity(Long id){
        testCenterRepository.deleteById(id);
    }


    // Récupérer la liste des candidats du TestCenter ayant le code 'GRE' (fonction nommée)
    public Set<CandidateEntity> getCandidatesByTestCenterCodeGRE() {
        TestCenterEntity testCenter = testCenterRepository.findByCode(TestCenterCode.GRE);
        return testCenter.getCandidates();
    }


}
