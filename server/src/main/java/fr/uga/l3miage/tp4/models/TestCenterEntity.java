package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.TestCenterCode;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TestCenterEntity {
    @Id
    private Long id;
    @Enumerated(EnumType.STRING)
    private TestCenterCode code;
    private String university;
    private String city;

    @OneToMany(mappedBy = "test_Center")
    private Set<CandidateEntity> candidates;

    @OneToMany(mappedBy = "test_Center")
    private Set<ExaminerEntity> examiners;



}
