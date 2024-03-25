package fr.uga.l3miage.tp4.models;

import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
public class SkillEntity {
    @Id
    private Long id;

    @Column(unique = true)
    private  String name;

    @ManyToMany
    private Set<ExamEntity> exams;
}
