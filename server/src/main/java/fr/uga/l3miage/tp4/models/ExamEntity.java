package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;

@Entity
public class ExamEntity {
    @Id
    private Long id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @Column(unique = true)
    private String name;

    private Integer weight;

    @OneToMany(mappedBy = "exam")  //le mappedBy doit être du côté OneToMany
    private Set<CandidateEvaluationGridEntity> EvaluationGrids;

    @ManyToMany // On suit la logique (le sens et pas la flèche dans la déclaration du ManyToMany unidirectionnel
    private Set<SkillEntity> evaluatedSkills;

    @ManyToOne
    private EcosSessionEntity ecosSession;

}
