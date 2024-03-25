package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class EvaluationCriteriaEntity {
    @Id
    private Long id;

    @Column(nullable = false)
    private String description;

    private boolean hasCandidatePerformedCriteria;

    @Entity
    public static class CandidateEntity {
        private LocalDate birthDate;
        private boolean hasExtraTime;


        @ManyToOne
        private Set<TestCenterEntity> testCenters;
    }
}