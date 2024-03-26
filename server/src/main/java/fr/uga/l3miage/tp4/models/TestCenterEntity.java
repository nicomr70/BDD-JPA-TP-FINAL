package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.TestCenterCodeType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class TestCenterEntity {
    @Id
    private Long id;

    private TestCenterCodeType code;

    private  String university;

    private String city;

    @OneToMany(mappedBy = "testCenter")
    private Set<ExaminerEntity> examiners;

    @OneToMany(mappedBy = "testCenter")
    private Set<CandidateEntity> candidates;
}
