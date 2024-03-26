package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.EcosSessionProgrammationEntity;
import fr.uga.l3miage.tp4.repositories.EcosSessionProgrammationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EcosSessionProgrammationComponent {

    private final EcosSessionProgrammationRepository ecosSessionProgrammationRepository;

    public EcosSessionProgrammationEntity getEcosSessionProgrammation(Long id){
        return ecosSessionProgrammationRepository.findById(id).orElseThrow();

    }

    public EcosSessionProgrammationEntity createEcosSessionProgrammation(EcosSessionProgrammationEntity ecosSessionProgrammationEntity){
        return ecosSessionProgrammationRepository.save(ecosSessionProgrammationEntity);
    }

    public EcosSessionProgrammationEntity updateEcosSessionProgrammation(Long id, EcosSessionProgrammationEntity ecosSessionProgrammationEntity){
        EcosSessionProgrammationEntity ancien = ecosSessionProgrammationRepository.findById(id).orElseThrow();
        ancien.setLabel(ecosSessionProgrammationEntity.getLabel());
        return ecosSessionProgrammationRepository.save(ancien);

    }

    public void deleteEcosSessionProgrammation(Long id){
        ecosSessionProgrammationRepository.deleteById(id);
    }



}
