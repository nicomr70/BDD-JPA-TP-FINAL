package fr.uga.l3miage.tp4.models;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
public class ExamEntity {

    @Id
    private Long id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;
    @Column(unique = true)

    private String name;

    private int weight;

    @OneToMany(mappedBy = "exam")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;

    @ManyToMany
    @JoinTable(name="exam_skill",joinColumns ={@JoinColumn(name = "exam_id")},inverseJoinColumns = {@JoinColumn(name = "skill_id")})

    private Set<SkillEntity> skills;

    @ManyToOne
    private EcosSessionEntity ecosSession;

}
