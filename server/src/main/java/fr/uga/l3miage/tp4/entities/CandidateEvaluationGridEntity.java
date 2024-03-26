package fr.uga.l3miage.tp4.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;
    private Double grade;
    private LocalDateTime submissionDate;
    @ManyToOne
    private ExamEntity examEntity;
    @ManyToOne
    private CandidateEntity candidateEntity;
}
