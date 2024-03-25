package fr.uga.l3miage.tp4.models;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@DiscriminatorValue("examiner")
public class ExaminerEntity extends UserEntity {
    @Column(length = 6)
    private String login;

    private String password;

    @OneToMany(mappedBy = "ExaminerEntity",cascade = CascadeType.ALL)
    private Set<CandidateEvaluationGridEntity> remplit;

    @ManyToOne
    private TestCenterEntity estRattachéA;
}
