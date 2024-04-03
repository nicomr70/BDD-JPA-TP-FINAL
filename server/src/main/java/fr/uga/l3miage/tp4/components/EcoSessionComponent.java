package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.entities.EcoSessionEntity;
import fr.uga.l3miage.tp4.repositories.EcoSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EcoSessionComponent {
    private final EcoSessionRepository ecoSessionRepository;

    public EcoSessionEntity getEcoSession(Long id){
        return ecoSessionRepository.findById(id).orElseThrow();
    }

    public EcoSessionEntity createEcoSession(EcoSessionEntity ecoSessionEntity){
        return ecoSessionRepository.save(ecoSessionEntity);
    }

    public void deleteEcoSession(Long id){
        ecoSessionRepository.deleteById(id);
    }

    public EcoSessionEntity updateName(Long id, String newName){
        EcoSessionEntity ecoSessionEntity= ecoSessionRepository.findById(id).orElseThrow();
        ecoSessionEntity.setName(newName);
        return ecoSessionRepository.save(ecoSessionEntity);
    }
}
