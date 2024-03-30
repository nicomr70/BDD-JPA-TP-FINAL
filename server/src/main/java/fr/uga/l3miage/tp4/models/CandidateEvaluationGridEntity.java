package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;
    @Column(precision = 2)
    private double grade;
    private LocalDateTime submissionDate;

    @ManyToOne
    private ExaminerEntity examinerEntity;

    @ManyToOne
    private CandidateEntity candidateEntity;

    @ManyToOne
    private ExamEntity examEntity;
}
