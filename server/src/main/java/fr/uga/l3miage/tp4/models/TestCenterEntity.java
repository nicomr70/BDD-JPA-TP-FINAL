package fr.uga.l3miage.tp4.models;

import java.util.Set;

import javax.persistence.*;

import fr.uga.l3miage.tp4.enums.TestCenterCode;;

@Entity
public class TestCenterEntity {
    @Id
    private Long id;

    private TestCenterCode code;
    private String university;
    private String city;

    @OneToMany(mappedBy = "testCenterEntity")
    private Set<CandidateEntity> candidateEntity;

    @OneToMany(mappedBy = "testCenterEntity")
    private Set<ExaminerEntity> examinerEntity;
}

