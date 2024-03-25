package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Getter
@Setter
public class TestCenterEntity {
    @Id
    private Long id ;
    private TestCenterCode code ;
    private String university ;
    private String city ;

    @OneToMany
    private Set<CandidateEntity> candidates ;

    @OneToMany
    private Set<ExaminerEntity> examiners ;
}
