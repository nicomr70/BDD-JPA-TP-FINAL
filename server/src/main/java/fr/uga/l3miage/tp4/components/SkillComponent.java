package fr.uga.l3miage.tp4.components;

import fr.uga.l3miage.tp4.models.SkillEntity;
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

    public SkillEntity createSkill(SkillEntity skill){
        return skillRepository.save(skill);
    }

    public SkillEntity updateSkill(Long id, SkillEntity skillEntity){
        SkillEntity skill = skillRepository.findById(id).orElseThrow();
        skill.setName(skillEntity.getName());
        return skillRepository.save(skill);
    }

    public void deleteSkill(Long id){
        skillRepository.deleteById(id);
    }
}