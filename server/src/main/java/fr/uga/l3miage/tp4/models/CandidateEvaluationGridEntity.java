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
public class CandidateEvaluationGridEntity {

    @Id
    private Long sheetNumber;

    private double grade;

    private LocalDateTime submissionDate;

    @ManyToOne
    private CandidateEntity candidat;

    @ManyToMany
    private Set<EvaluationCriteriaEntity> evaluationCriterias;

    @ManyToOne
    private ExamEntity exam;
}
