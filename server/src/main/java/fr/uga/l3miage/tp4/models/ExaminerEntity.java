package fr.uga.l3miage.tp4.models;
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

    @ManyToOne
    private TestCenterEntity testCenterEntity;
    @OneToMany (mappedBy = "examinerEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;

}
