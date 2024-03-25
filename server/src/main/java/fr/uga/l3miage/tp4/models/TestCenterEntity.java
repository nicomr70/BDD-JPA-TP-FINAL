package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.TestCenterCode;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TestCenterEntity {

    @Id
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    private TestCenterCode code;

    private String university;

    private String city;


    @OneToMany
    private Set<CandidateEntity> candidates;

    @OneToMany
    private Set<ExaminerEntity> examiners;


}
