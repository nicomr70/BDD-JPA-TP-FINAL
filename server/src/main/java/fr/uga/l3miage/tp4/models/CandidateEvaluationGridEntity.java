package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    @Column(name="sheet_number")
    private Long sheetNumber;

    @Column(name="grade")
    private double grade;

    @Column(name="submission_date")
    private LocalDateTime submissionDate;
}
