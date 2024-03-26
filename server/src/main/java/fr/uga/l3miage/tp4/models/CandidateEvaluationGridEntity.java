package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;
    private double grade ;
    private LocalDateTime submissionDate;

   @ManyToOne
    private ExamEntity examEntity;
    @ManyToOne
    private CandidateEntity candidateEntity;

    @ManyToOne
    private ExaminerEntity examinerEntity;
}