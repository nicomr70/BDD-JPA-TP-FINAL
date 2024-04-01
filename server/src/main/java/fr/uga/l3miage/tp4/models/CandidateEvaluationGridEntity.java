package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    private Long sheetNumber ;
    private double grande ;
    private LocalDateTime submissionDate ;
    @ManyToOne
    @JoinColumn(name = "id_exam" , referencedColumnName = "id")
    private ExamEntity exam ;

    @ManyToOne
    @JoinColumn(name = "id_candidate" , referencedColumnName = "id")
    private CandidateEntity candidate ;

}
