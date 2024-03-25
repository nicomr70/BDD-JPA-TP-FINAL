package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.TestCenterCode;

import javax.persistence.*;
import java.util.Enumeration;
import java.util.Set;

@Entity
public class TestCenterEntity {
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private TestCenterCode code;

    private String University;

    private String city;

    @OneToMany(mappedBy = "testCenterEntity")
    private Set<ExaminerEntity> examinerEntities;

    @OneToMany(mappedBy = "testCenterEntity")
    private Set<CandidateEntity> candidateEntities;

}
