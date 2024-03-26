package fr.uga.l3miage.tp4.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity


public class CandidateEvaluationGridEntity {
    @Id
    private long sheetNumber;

    private double grade;

    private LocalDateTime submissionDate;

    @ManyToOne
    private ExamEntity examinerEntity;

    @ManyToOne
    private CandidateEntity candidateEntity;
}
