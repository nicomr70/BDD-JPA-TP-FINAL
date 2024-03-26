package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.EcosSessionEntity;
import fr.uga.l3miage.tp4.repositories.EcosSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EcosSessionComponent {
    private final EcosSessionRepository ecosSessionRepository;

    public EcosSessionEntity getEcosSession(Long id){
        return ecosSessionRepository.findById(id).orElseThrow();
    }

    public EcosSessionEntity createEcosSession(EcosSessionEntity ecosSession){
        return ecosSessionRepository.save(ecosSession);
    }

    public EcosSessionEntity updateEcosSession(Long id, EcosSessionEntity ecosSessionEntity){
        EcosSessionEntity ancien = ecosSessionRepository.findById(id).orElseThrow();
        ancien.setName(ecosSessionEntity.getName());
        ancien.setStartDate(ecosSessionEntity.getStartDate());
        ancien.setEndDate(ecosSessionEntity.getEndDate());
        ancien.setStatus(ecosSessionEntity.getStatus());
        return ancien;
    }

    public void deleteEcosSession(Long id){
        ecosSessionRepository.deleteById(id);
    }
}
