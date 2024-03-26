package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.EcosSessionProgrammationStepEntity;
import fr.uga.l3miage.tp4.repositories.EcosSessionProgrammationStepRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EcosSessionProgrammationStepComponent {
    private final EcosSessionProgrammationStepRepository ecosSessionProgrammationStepRepository;

    public EcosSessionProgrammationStepEntity getEcosSessionProgrammationStep(Long id){
        return ecosSessionProgrammationStepRepository.findById(id).orElseThrow();
    }

    public EcosSessionProgrammationStepEntity createEcosSessionProgrammationStep(EcosSessionProgrammationStepEntity ecosSessionProgrammationStep){
        return ecosSessionProgrammationStepRepository.save(ecosSessionProgrammationStep);
    }

    public EcosSessionProgrammationStepEntity updateEcosSessionProgrammationStep(Long id, EcosSessionProgrammationStepEntity ecosSessionProgrammationStepEntity){
        EcosSessionProgrammationStepEntity ancien = ecosSessionProgrammationStepRepository.findById(id).orElseThrow();
        ancien.setDateTime(ecosSessionProgrammationStepEntity.getDateTime());
        ancien.setCode(ecosSessionProgrammationStepEntity.getCode());
        ancien.setDescription(ecosSessionProgrammationStepEntity.getDescription());
        return ecosSessionProgrammationStepRepository.save(ancien);
    }

    public void deleteEcosSessionProgrammationStep(Long id){
        ecosSessionProgrammationStepRepository.deleteById(id);
    }

}

