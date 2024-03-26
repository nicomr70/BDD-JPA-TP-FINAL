package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enumeration.TestCenterCode;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TestCenterEntity {
    @Id
    private long id;
    private TestCenterCode code;
    private String university;

    private String city;

    @OneToMany(mappedBy = "testCenterEntity", cascade = CascadeType.ALL)
    private Set<CandidateEntity> CandidateEntities;

    @OneToMany(mappedBy = "testCenterEntity",cascade = CascadeType.ALL)
    private Set<ExaminerEntity> ExaminerEntities;

}
