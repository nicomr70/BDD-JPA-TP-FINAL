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
        EcosSessionProgrammationStepEntity ecosSessionProgrammationStep = ecosSessionProgrammationStepRepository.findById(id).orElseThrow();
        ecosSessionProgrammationStep.setDateTime(ecosSessionProgrammationStepEntity.getDateTime());
        ecosSessionProgrammationStep.setCode(ecosSessionProgrammationStepEntity.getCode());
        ecosSessionProgrammationStep.setDescription(ecosSessionProgrammationStepEntity.getDescription());
        return ecosSessionProgrammationStepRepository.save(ecosSessionProgrammationStep);
    }

    public void deleteEcosSessionProgrammationStep(Long id){
        ecosSessionProgrammationStepRepository.deleteById(id);
    }

}