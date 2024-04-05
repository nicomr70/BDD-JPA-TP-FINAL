package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatus;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

import fr.uga.l3miage.tp4.repositories.ExamRepository;
import lombok.*;


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
    private int weight;

    @OneToMany(mappedBy = "exam")
    private Set<CandidateEvaluationGridEntity> candidateEvaluations;

    @ManyToOne
    private EcosSessionEntity ecosSession;

    @ManyToMany
    private Set<SkillEntity> skills;




}
