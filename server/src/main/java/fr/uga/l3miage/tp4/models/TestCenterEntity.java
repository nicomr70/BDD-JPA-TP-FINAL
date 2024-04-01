package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

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
