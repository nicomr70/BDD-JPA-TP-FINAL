package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;

    private double grade;

    private LocalDate submissionDate;
}