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
        EcosSessionEntity ecosSession = ecosSessionRepository.findById(id).orElseThrow();
        ecosSession.setName(ecosSessionEntity.getName());
        ecosSession.setStartDate(ecosSessionEntity.getStartDate());
        ecosSession.setEndDate(ecosSessionEntity.getEndDate());
        ecosSession.setStatus(ecosSessionEntity.getStatus());
        return ecosSessionRepository.save(ecosSession);
    }

    public void deleteEcosSession(Long id){
        ecosSessionRepository.deleteById(id);
    }
}