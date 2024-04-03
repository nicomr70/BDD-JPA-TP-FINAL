package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.EcosSessionEntity;
import fr.uga.l3miage.tp4.models.EcosSessionProgrammationStepEntity;
import fr.uga.l3miage.tp4.repositories.EcosSessionProgrammationStepRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EcosSessionProgrammationStepComponent {
    private EcosSessionProgrammationStepRepository ecosSessionProgrammationStepRepository;

    public EcosSessionProgrammationStepEntity getLastEcoSessionProgrammationStep(){
        return ecosSessionProgrammationStepRepository.findAll().getLast();
    };
}
