package fr.uga.l3miage.tp4.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ExaminerEntity extends UserEntity{
    private String login;
    private String password;

    @OneToMany(mappedBy = "examiner")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGrids;

    @ManyToOne
    private TestCenterEntity testCenter;
}
