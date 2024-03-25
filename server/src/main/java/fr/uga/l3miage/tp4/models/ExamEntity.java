package fr.uga.l3miage.tp4.models;

import org.apache.tomcat.jni.Local;
import org.springframework.scheduling.concurrent.ScheduledExecutorTask;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class ExamEntity {
    @Id
    private Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Column(unique = true)
    private String name;
    private int weight;
    @ManyToMany
    private Set<SkillEntity> skills;
    @OneToMany(mappedBy = "exam")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;
    @ManyToOne
    private EcosSessionEntity session;
}
