package fr.uga.l3miage.tp4.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class SkillEntity {
    @Id
    private Long id;

    @Column(unique = true)
    private  String name;

    @ManyToMany()
    private Set<ExamEntity> examEntities;

}