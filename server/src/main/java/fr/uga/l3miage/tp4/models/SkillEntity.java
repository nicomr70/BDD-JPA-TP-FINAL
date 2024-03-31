package fr.uga.l3miage.tp4.models;

import java.util.Set;

import javax.persistence.*;

@Entity
public class SkillEntity {


    @Id
    private Long id;

    @Column(unique = true)
    private String name;

    @ManyToMany(mappedBy = "skillEntities")
    private Set<ExamEntity> examEntities;
}
