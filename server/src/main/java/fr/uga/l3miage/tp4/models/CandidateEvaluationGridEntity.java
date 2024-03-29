package fr.uga.l3miage.tp4.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber;

    private double grade;

    private LocalDateTime submissionDate;

    @ManyToOne
    private CandidateEntity candidateEntity;

    @ManyToOne
    private ExamEntity examEntity;
}
