package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class SkillEntity {
    @Id
    private long id;
    @Id
    @Column(unique = true) private String name;

    @ManyToMany()
    private Set<ExamEntity> examEntities;
}
