package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.enums.SessionStatus;
import fr.uga.l3miage.tp4.models.EcosSessionProgrammationStepEntity;
import fr.uga.l3miage.tp4.repositories.EcosSessionProgrammationStepRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class EcosSessionProgrammationStepComponent {
    private final EcosSessionProgrammationStepRepository ecosSessionProgrammationStepRepository;
    public EcosSessionProgrammationStepEntity getEcosSessionProgrammationStepEntity( Long id){
        return ecosSessionProgrammationStepRepository.findById(id).orElseThrow();
    }
    public Optional<EcosSessionProgrammationStepEntity> getEcosSessionProgramation(SessionStatus status){

        return Optional.ofNullable(ecosSessionProgrammationStepRepository.findFirstByOrderByDateTimeDescAndEcosSessionProgrammation_EcosSession_Status(status));

    }

}
