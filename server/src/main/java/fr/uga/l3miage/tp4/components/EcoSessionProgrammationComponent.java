package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.entities.EcoSessionProgrammationEntity;
import fr.uga.l3miage.tp4.repositories.EcoSessionProgrammationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EcoSessionProgrammationComponent {
    EcoSessionProgrammationRepository ecoSessionProgrammationRepository;

    public EcoSessionProgrammationEntity getEcoSessionProgrammation (Long id){
        return ecoSessionProgrammationRepository.findById(id).orElseThrow();
    }

    public EcoSessionProgrammationEntity createEcoSessionProgrammation (EcoSessionProgrammationEntity ecoSessionProgrammationEntity){
        return ecoSessionProgrammationRepository.save(ecoSessionProgrammationEntity);
    }

    public void deleteEcoSessionProgrammation(Long id){
        ecoSessionProgrammationRepository.deleteById(id);
    }

    public EcoSessionProgrammationEntity updateLabel(Long id, String newLabel){
        EcoSessionProgrammationEntity ecoSessionProgrammationEntity = ecoSessionProgrammationRepository.findById(id).orElseThrow();
        ecoSessionProgrammationEntity.setLabel(newLabel);
        return ecoSessionProgrammationRepository.save(ecoSessionProgrammationEntity);
    }
}
