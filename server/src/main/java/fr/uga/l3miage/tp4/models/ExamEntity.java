package fr.uga.l3miage.tp4.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
public class ExamEntity {
    @Id
    private long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Column(unique = true) private String name;

    @ManyToOne()
    private EcosSessionEntity ecosSessionEntity;

    @ManyToMany(mappedBy = "examEntities")
    private Set<SkillEntity> skillEntities;

    @OneToMany(mappedBy = "examEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

}
