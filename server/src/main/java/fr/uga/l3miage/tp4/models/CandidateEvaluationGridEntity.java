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

    @Column(precision = 4,scale = 2)
    private Double grade;

    private LocalDateTime submissionDate;

    @ManyToOne
    private ExamEntity correspondA;

    @ManyToOne
    private CandidateEntity appartientA;

    @ManyToOne
    private ExaminerEntity estRemplitPar;

    @ManyToMany
    private Set<EvaluationCriteriaEntity> appartientAEvaluationCriteria;


}

