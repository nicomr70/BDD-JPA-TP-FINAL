package fr.uga.l3miage.tp4.modules;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter

public class CandidateEvaluationGridEntity {
    @Id
    @Column(name = "sheet_number")
    private long sheetNumber;

    private double grade;

    @Column(name = "submission_date")
    private LocalDateTime submissionDate;

    @ManyToOne
    @JoinColumn(name = "exam_id")
    private ExamEntity examinerEntity;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private CandidateEntity candidateEntity;
}
