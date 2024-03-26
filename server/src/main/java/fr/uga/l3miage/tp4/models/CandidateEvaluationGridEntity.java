package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;

    private double grade;

    private LocalDate submissionDate;

    @ManyToOne
    private ExamEntity exam;
    /*
    * Relation 'correspondA' entre CandidateEvaluationGridEntity et ExamEntity, tq:
    * Chaque grille d'évaluation du candidat correspond à un examen.
    * Chaque examen peut avoir plusieurs grilles d'évaluation de (ou par) candidat.
    */
}