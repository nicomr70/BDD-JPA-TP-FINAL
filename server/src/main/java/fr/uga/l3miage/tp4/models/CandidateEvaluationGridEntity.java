package fr.uga.l3miage.tp4.models;

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
public class CandidateEvaluationGridEntity {

    @Id
    private Long sheetNumber;

    /* scale: 2 chiffres après la virgule, precision est utilisé pour le nb
    chiffres avant et après la virgule */
    @Column(scale = 2)
    private double grade;

    private LocalDateTime submissionDate;

    @ManyToOne
    private CandidateEntity candidate;

    @ManyToMany //(mappedBy = "candidateEvaluationGrids")
    private Set<EvaluationCriteriaEntity> evaluationCriterias;

    @ManyToOne
    private ExamEntity exam;



}
