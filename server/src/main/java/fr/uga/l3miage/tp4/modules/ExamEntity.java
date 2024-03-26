package fr.uga.l3miage.tp4.modules;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class ExamEntity {

    @Id
    private long id;


    @Column(name = "start_date")
    private LocalDateTime startDate;


    @Column(name = "end_date")
    private LocalDateTime endDate;


    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "examinerEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntitySet;

    @ManyToMany
    @JoinTable(
            name = "skill_exam",
            joinColumns = @JoinColumn(name = "exam_id") ,
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private Set<SkillEntity> skillEntities;

    @ManyToOne
    @JoinTable(
            name = "ecosSession_exam",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    private EcosSessionEntity ecosSessionEntity;
}
