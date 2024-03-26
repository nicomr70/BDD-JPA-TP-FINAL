package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CandidateEvaluationGridEntity {
    @Id
    Long id;
    TestCenterCode code ;
    String university;
    String city;

}
