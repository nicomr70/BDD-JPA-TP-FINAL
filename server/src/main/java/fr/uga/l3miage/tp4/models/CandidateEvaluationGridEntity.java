package fr.uga.l3miage.tp4.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
@Data
@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;
    private double grade;
    private LocalDateTime submissionDate;
    @ManyToOne
    private CandidateEntity candidat;

    @ManyToOne()
    private ExamEntity examEntity;

    @ManyToMany(mappedBy = "candidateEvaluationGridEntity")
    private Set<EvaluationCriteriaEntity> evaluationCriteriaEntity;

    public double getGrade() {
        return this.grade;
    }
}
