package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;


@Entity
@Data
public class TestCenterEntity {
    @Id
    private Long id ;

    private TestCenterCode code;
    private String university ;
    private String city;

    @OneToMany(mappedBy = "testCenterEntity")
    private Set<CandidateEntity> candidateEntities;

    @OneToMany(mappedBy = "testCenterEntity")
    private Set<ExaminerEntity> examinerEntities;
}