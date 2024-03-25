package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.repositories.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SkillComponent {
    private SkillRepository skillRepository;
}
