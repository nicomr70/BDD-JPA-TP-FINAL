package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class SkillEntity {
    @Id
    Long id ;
    @Column(unique = true)
    String name ;
    @ManyToMany
    private Set<ExamEntity> exams ;


}
