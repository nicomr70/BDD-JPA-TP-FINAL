package fr.uga.l3miage.tp4.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;


@Entity@Data
@NoArgsConstructor
@AllArgsConstructor

public class ExaminerEntity {
    @Column(length = 6)
    private String login;
    private String password;
    @ManyToOne
    private TestCenterEntity testCenterEntity;

    @OneToMany(mappedBy = "examinerEntity")
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;
}
