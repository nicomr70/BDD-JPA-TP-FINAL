package fr.uga.l3miage.tp4.components;

import org.springframework.stereotype.Component;

import fr.uga.l3miage.tp4.models.EcosSessionProgrammationStepEntity;
import fr.uga.l3miage.tp4.repositories.EcosSessionProgrammationStepRepository;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
//Premier component crée, sur la base du TP3
public class EcosSessionProgrammationStepComponent {
    private final EcosSessionProgrammationStepRepository ecosSessionProgrammationStepRepository;

    // Read the last step
    public EcosSessionProgrammationStepEntity getLastEcosSessionProgrammationStep() {
        return ecosSessionProgrammationStepRepository.findLastStep();
    }


}
