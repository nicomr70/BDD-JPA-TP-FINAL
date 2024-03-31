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

    @Column(unique = true)
    private String name;

    private LocalDateTime endDate;

    private LocalDateTime startDate;

    private Integer weight;


    @ManyToOne
    private EcoSessionEntity estFaitDans;

    @OneToMany(mappedBy = "examEntity",cascade = CascadeType.ALL)
    private Set<CandidateEvaluationGridEntity> aPourGrillesEvaluations;

    @ManyToMany(mappedBy = "examEntity")
    private Set<SkillEntity> evalue;
}

