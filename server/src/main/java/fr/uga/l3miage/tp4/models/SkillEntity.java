package fr.uga.l3miage.tp4.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class SkillEntity {
    @Id
    private Long id;
    @Column(unique = true)
    private String name;

    @ManyToMany(mappedBy = "skillEntities")
    private Set<ExamEntity> examEntities;
}
