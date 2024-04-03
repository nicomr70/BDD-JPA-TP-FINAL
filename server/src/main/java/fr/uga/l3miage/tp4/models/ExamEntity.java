package fr.uga.l3miage.tp4.models;

import org.hibernate.internal.util.type.PrimitiveWrapperHelper;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class ExamEntity {
    @Id
    private Long id;

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Column(unique = true)
    private String name;
    private int weight;

    @ManyToOne
    private EcosSessionEntity ecosSession;

    @OneToMany(mappedBy = "exam")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;

    @ManyToMany
    private Set<SkillEntity> skills;

}
