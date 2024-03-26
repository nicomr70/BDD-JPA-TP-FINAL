package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.entities.EcoSessionProgrammationEntity;
import fr.uga.l3miage.tp4.entities.EcoSessionProgrammationStepEntity;
import fr.uga.l3miage.tp4.repositories.EcoSessionProgrammationRepository;
import fr.uga.l3miage.tp4.repositories.EcoSessionProgrammationStepRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EcoSessionProgrammationStepComponent {
    EcoSessionProgrammationStepRepository ecoSessionProgrammationStepRepository;

    public EcoSessionProgrammationStepEntity getEcoSessionProgrammationStep (Long id){
        return ecoSessionProgrammationStepRepository.findById(id).orElseThrow();
    }

    public EcoSessionProgrammationStepEntity createEcoSessionProgrammationStep (EcoSessionProgrammationStepEntity ecoSessionProgrammationStepEntity){
        return ecoSessionProgrammationStepRepository.save(ecoSessionProgrammationStepEntity);
    }

    public void deleteEcoSessionProgrammationStep(Long id){
        ecoSessionProgrammationStepRepository.deleteById(id);
    }

    public EcoSessionProgrammationStepEntity updateLabel(Long id, String newCode){
        EcoSessionProgrammationStepEntity ecoSessionProgrammationStepEntity = ecoSessionProgrammationStepRepository.findById(id).orElseThrow();
        ecoSessionProgrammationStepEntity.setCode(newCode);
        return ecoSessionProgrammationStepRepository.save(ecoSessionProgrammationStepEntity);
    }


}
