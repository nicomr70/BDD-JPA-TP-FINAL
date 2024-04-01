package fr.uga.l3miage.tp4.models;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ExaminerEntity extends UserEntity{

    @Column(length = 6)
    private String login;
    private String password;

    @ManyToOne
    private TestCenterEntity testCenterEntity;

    @OneToMany
    @JoinColumn(name="examiner_id")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;
}
