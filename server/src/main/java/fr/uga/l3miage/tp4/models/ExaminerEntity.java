package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
public class ExaminerEntity extends  UserEntity{
    @Column(nullable = false)
    @Size(min = 8, max = 8)
    private String login;
    @Column(nullable = false)
    private String password;
    @OneToMany  // La grille d'évaluation à remplire par l'examinateur
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntitySet;
    @ManyToOne
    private TestCenterEntity testCenter;

}
