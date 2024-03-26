package fr.uga.l3miage.tp4.models;
import lombok.*;
import fr.uga.l3miage.tp4.enums.TestCenterCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

    private TestCenterCode code;

    private String university;

    private String city;

    @OneToMany(mappedBy = "testCenter")
    private Set<CandidateEntity> candidats;

    @OneToMany(mappedBy = "testCenter")
    private Set<ExaminerEntity> examiners;
}
