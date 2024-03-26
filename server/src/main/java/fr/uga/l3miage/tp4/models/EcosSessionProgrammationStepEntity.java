package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

import fr.uga.l3miage.tp4.enums.TestCenterCode;

public class EcosSessionProgrammationStepEntity {
    // Au secours les noms ;-;

    @Id
    private Long id;

    private TestCenterCode code;
    private String university;
    private String city;

    @ManyToOne
    private EcosSessionProgrammationEntity ecosSessionProgrammationEntities;

}   
