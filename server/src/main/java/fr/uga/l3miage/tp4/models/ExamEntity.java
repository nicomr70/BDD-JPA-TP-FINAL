package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class ExamEntity {
    @Id
    private Long id ;
    private LocalDateTime startDate ;
    private LocalDateTime endDate ;
    @Column(unique = true)
    private String name ;
    private int weight ;

    @ManyToOne
    @JoinColumn(name = "id_ecoSession" , referencedColumnName = "id")
    private EcosSessionEntity ecoSession ;

    @ManyToMany
    @JoinTable(name = "Table_Association_Exam_Skill" ,
            joinColumns = @JoinColumn(name = "id") ,
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    private Set<SkillEntity> skills ;

    @OneToMany(targetEntity = CandidateEvaluationGridEntity.class , mappedBy = "exam")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrid ;
}
