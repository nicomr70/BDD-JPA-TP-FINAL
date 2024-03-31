package fr.uga.l3miage.tp4.models;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CandidateEvaluationGridEntity{
    private long sheetNumber;
    private double grade;
    private LocalDateTime submissTime;

    @ManyToOne
    private Set<CandidateEntity> candidateEntities;

    @ManyToOne
    private Set<ExamEntity> examEntities;

    @ManyToMany
    private Set<EvaluationCriteriaEntity> EvaluationCriteriaEntities;
}
