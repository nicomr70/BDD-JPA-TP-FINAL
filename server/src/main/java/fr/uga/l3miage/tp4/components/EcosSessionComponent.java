package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.repositories.EcosSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EcosSessionComponent {
    private EcosSessionRepository ecosSessionRepository;
}
