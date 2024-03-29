package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.EcosSessionProgrammationStepEntity;
import fr.uga.l3miage.tp4.repositories.EcosSessionProgrammationStepRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EcosSessionProgrammationStepComponent {
    public final EcosSessionProgrammationStepRepository ecosSessionProgrammationStepRepository;


    // la dernière étape de la programmation qui devra être réalisée (fonction nommée)

    public EcosSessionProgrammationStepEntity getLastProgrammationstep() {
        return ecosSessionProgrammationStepRepository.findTopByOrderByDateTimeDesc();
    }
}
