package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class SkillEntity {

    @Id
    private Long id;

    @Column(unique = true)
    private String name;
@ManyToMany (mappedBy ="skillsEntity")
    private Set<ExamEntity> examsEntity;

}