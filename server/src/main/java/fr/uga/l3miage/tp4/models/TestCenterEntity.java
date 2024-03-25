package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.TestCenterCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class TestCenterEntity {
    @Id
    private Long id;

    @Column(nullable = false)
    private TestCenterCode code;
    @Column(nullable = false)
    private  String university;
    @Column(nullable = false)
    private String city;

    @OneToMany(mappedBy = "TestCenter")
    private Set<CandidateEntity> candidates;
    @OneToMany(mappedBy = "TestCenter")
    private  Set<ExaminerEntity> examiners;

}
