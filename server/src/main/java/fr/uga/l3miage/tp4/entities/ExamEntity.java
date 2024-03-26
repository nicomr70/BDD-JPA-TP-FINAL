package fr.uga.l3miage.tp4.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExamEntity {
    @Id
    private Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Column(unique = true)
    private String name;
    private Integer weight;
    @ManyToMany
    private Set<SkillEntity> skillEntities;
    @ManyToOne
    private EcoSessionEntity ecoSessionEntity;

    @OneToMany(mappedBy="examEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;
}
