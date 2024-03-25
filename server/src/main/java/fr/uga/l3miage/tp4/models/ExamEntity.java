package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

//tout en mode createdrop pay attention mona
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
