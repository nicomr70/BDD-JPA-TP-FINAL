package fr.uga.l3miage.tp4.models;

import lombok.*;

import javax.persistence.*;
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
    @Column (unique = true )
    private String name;
    private int weight;

    @ManyToMany
   private Set<SkillEntity> skillsEntity;
    @OneToMany(mappedBy = "examEntity")
   private Set<CandidateEvaluationGridEntity> candidateEvaluationGridsEntity;
    @ManyToOne
    private EcosSessionEntity ecosSessionEntity;
}