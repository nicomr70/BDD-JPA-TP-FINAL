package fr.uga.l3miage.tp4.models;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class ExamEntity {
    @Id
    private Long id;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @Column(unique = true)
    private String name;

    private int weight;

    // TODO: OneToMany relationship with CandidateEvaluationGridEntity
    // TODO: ManyToOne relationship with EcosSessionEntity
}
