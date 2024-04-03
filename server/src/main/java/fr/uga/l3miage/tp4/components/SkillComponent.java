package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.entities.SkillEntity;
import fr.uga.l3miage.tp4.repositories.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SkillComponent {
    private final SkillRepository skillRepository;

    public SkillEntity getSkill(Long id){
        return skillRepository.findById(id).orElseThrow();
    }

    public SkillEntity createSkill(SkillEntity skillEntity){
        return skillRepository.save(skillEntity);
    }

    public void deleteSkill(Long id){
        skillRepository.deleteById(id);
    }

    public SkillEntity updateName(Long id, String newName){
        SkillEntity skillEntity=skillRepository.findById(id).orElseThrow();
        skillEntity.setName(newName);
        return skillRepository.save(skillEntity);
    }
}
