package fr.uga.l3miage.tp4.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
//import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ExamEntity {
    @Id
    private long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Column(unique = true)
    private String name;

    private int weight;

/*
    @OneToMany(mappedBy = "CandidateEvaluationGridEntities")
    private Set<CandidateEvaluationGridEntity> CandidateEvaluationGridEntities;

    @ManyToMany
    @JoinTable(
            name = "SkillAEvalue",
            joinColumns = @JoinColumn(name = "exam_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private Set<SkillEntity> skillEntities;
*/
    @OneToMany(mappedBy = "exam")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

    @ManyToMany(mappedBy = "exam")
    private Set<SkillEntity> skillEntities;

    @ManyToOne
    private Set<EcosSessionEntity> ecosSessionEntities;

}
