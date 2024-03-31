package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enumeration.TestCenterCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class TestCenterEntity {
    @Id
    private long id;
    @Enumerated(EnumType.STRING)
    private TestCenterCode code;
    private String university;

    private String city;


    @OneToMany(mappedBy = "testCenterEntities")
    private Set<CandidateEntity> CandidateEntities;

    @OneToMany(mappedBy = "testCenterEntities")
    private Set<ExaminerEntity> examinerEntities;


}
