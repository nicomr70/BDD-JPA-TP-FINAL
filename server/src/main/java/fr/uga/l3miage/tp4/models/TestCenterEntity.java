package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.TestCenterCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class TestCenterEntity {
    @Id
    Long id ;
    TestCenterCode code ;
    String university ;
    String city ;
    @OneToMany(mappedBy = "testCenter")
    private Set<CandidateEntity> candidates ;
    @OneToMany(mappedBy = "testCenter")
    private Set<ExaminerEntity> examiners ;





}
