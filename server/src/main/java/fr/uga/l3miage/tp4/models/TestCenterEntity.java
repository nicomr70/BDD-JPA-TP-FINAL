package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enumeration.TestCenterCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class TestCenterEntity {
    @Id
    private long id;
    private TestCenterCode code;
    private String university;

    private String city;

    @OneToMany
    @JoinColumn(name = "estRattachA")
    @JoinColumn(name = "aPourCandidats")
    private Set<CandidateEntity> CandidateEntities;

    @OneToMany
    @JoinColumn(name = "estRattachA")
    @JoinColumn(name = "aPourCandidats")
    private Set<ExaminerEntity> ExaminerEntities;

}
