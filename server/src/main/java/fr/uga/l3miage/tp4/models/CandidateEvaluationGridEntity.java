package fr.uga.l3miage.tp4.models;

import jdk.jfr.Enabled;
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
    private double grade;
    private LocalDateTime submissionDate;

    @ManyToOne
    private ExaminerEntity examiner;

    @ManyToOne
    @JoinColumn(name = "candidate_id", nullable = false)
    private CandidateEntity candidate;

    @ManyToMany(mappedBy = "evaluationGrids")
    private Set<EvaluationCriteriaEntity> evaluationCriteria;

    @ManyToOne
    private ExamEntity exam;

}
