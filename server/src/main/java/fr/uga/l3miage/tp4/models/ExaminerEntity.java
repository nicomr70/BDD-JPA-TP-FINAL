package fr.uga.l3miage.tp4.models;

import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/*<<<<<<< HEAD
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ExaminerEntity extends UserEntity {
    private String login;
    private String password;
    @ManyToOne
    @JoinColumn(name = "testCenterEntity")
    private TestCenterEntity testCenterEntity;
=======*/
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@DiscriminatorValue("ExaminerEntity")
public class ExaminerEntity extends UserEntity {
    private String login;
    private String password;

    @ManyToOne
    private Set<TestCenterEntity> testCenterEntities;

    @OneToMany
    private Set<CandidateEvaluationGridEntity> candidateEvaluationGridEntities;
}
