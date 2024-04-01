package fr.uga.l3miage.tp4.models;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class SkillEntity {
    @Id
    private Long id;
    @Column(unique = true)
    private String name;

    @ManyToMany(mappedBy = "skills")
    private Set<ExamEntity> exams;
}
