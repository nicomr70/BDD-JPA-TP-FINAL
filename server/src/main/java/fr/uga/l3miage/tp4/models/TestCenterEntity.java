package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import lombok.*;

import javax.persistence.Entity;
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
    private Long id;

    @Enumerated(EnumType.STRING)
    private TestCenterCode code;
    private String university;
    private String city;

    @OneToMany(mappedBy = "testCenterEntity")
    private Set<CandidateEntity> candidateEntities;

    @OneToMany(mappedBy = "testCenterEntity")
    private Set<ExaminerEntity> examinerEntities;

}
