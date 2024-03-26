package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.EcosSessionProgrammationStepEntity;
import fr.uga.l3miage.tp4.repositories.EcosSessionProgrammationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EcosSessionProgrammationComponent {

    private final EcosSessionProgrammationRepository ecosSessionProgrammationRepository;

    // Constructeur non nécessaire si vous utilisez Lombok @RequiredArgsConstructor

    // Récupérer la dernière étape de la programmation qui devra être réalisée
    public EcosSessionProgrammationStepEntity getLastStep() {
        return ecosSessionProgrammationRepository.findTopByOrderByDateTimeDesc();
    }
}

