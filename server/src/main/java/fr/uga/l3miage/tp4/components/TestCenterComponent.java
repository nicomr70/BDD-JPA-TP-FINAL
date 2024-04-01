package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import fr.uga.l3miage.tp4.models.CandidateEntity;
import fr.uga.l3miage.tp4.repositories.TestCenterRepository;

import java.util.Set;

public class TestCenterComponent {
    private TestCenterRepository testCenterRepository;

    public  Set<CandidateEntity> getListeCandidatTestCenter(TestCenterCode code){
        return  testCenterRepository.getTestCenterEntityByCandidates(TestCenterCode.GRE);
    }

}
