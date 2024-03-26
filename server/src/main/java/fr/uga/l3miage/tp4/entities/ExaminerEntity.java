package fr.uga.l3miage.tp4.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExaminerEntity extends UserEntity {
    private String login;
    private String password;
    @OneToMany
    @JoinColumn(name="examiner_id")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;
    @ManyToOne
    private TestCenterEntity testCenterEntity;
}
