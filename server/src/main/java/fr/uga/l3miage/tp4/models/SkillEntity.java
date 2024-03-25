package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class SkillEntity  {
    @Id
    private long id;

    @Column(unique = true) private String name;

    @ManyToMany()
    private Set<ExamEntity> examEntities;
}
