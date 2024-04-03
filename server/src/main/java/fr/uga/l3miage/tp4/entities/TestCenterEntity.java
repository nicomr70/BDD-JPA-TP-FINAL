package fr.uga.l3miage.tp4.entities;

import fr.uga.l3miage.tp4.enums.TestCenterCode;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestCenterEntity {
    @Id
    private Long id;
    @Enumerated(EnumType.ORDINAL)
    private TestCenterCode testCenterCode;
    private String university;
    private String city;
    @OneToMany(mappedBy = "testCenterEntity")
    private Set<CandidateEntity> candidateEntities;
    @OneToMany(mappedBy = "testCenterEntity")
    private Set<ExaminerEntity> examinerEntities;
}
