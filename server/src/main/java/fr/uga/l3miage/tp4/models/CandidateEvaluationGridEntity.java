package fr.uga.l3miage.tp4.models;

/*<<<<<<< HEAD
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class CandidateEvaluationGridEntity  {
    @Id
    private long sheetNumber;
    private LocalDateTime submissionDate;
    private double grade;

    @ManyToMany
    @JoinTable(name = "EvaluationTableCandiadate",joinColumns = @JoinColumn(name = "Evaluation_id")
            ,inverseJoinColumns = @JoinColumn(name = "candidate_sheetnumber"))
    private Set<EvaluationCriteriaEntity> EvaluationCriteriaEntities;

    @ManyToOne
    @JoinColumn(name = "candidateEntity")
    private CandidateEntity candidateEntity;

    @ManyToOne
    @JoinColumn(name = "examEntity")
    private ExamEntity examEntity ;

=======*/
import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
}
