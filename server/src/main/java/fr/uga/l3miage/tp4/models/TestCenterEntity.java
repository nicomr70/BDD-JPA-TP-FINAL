package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.TestCenterCode;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TestCenterEntity {

    @Id
    private Long id;

    private TestCenterCode code;

    private String university;
    private String city;

    @OneToMany(mappedBy = "testCenter")
    private Set <CandidateEntity> candidates;

    @OneToMany(mappedBy = "testCenter")
    private Set<ExaminerEntity> examiners;




}
