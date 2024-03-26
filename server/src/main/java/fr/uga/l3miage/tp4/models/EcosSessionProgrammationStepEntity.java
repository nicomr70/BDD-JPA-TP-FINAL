package fr.uga.l3miage.tp4.models;

import java.time.LocalDateTime;

import javax.persistence.*;

import fr.uga.l3miage.tp4.enums.TestCenterCode;

public class EcosSessionProgrammationStepEntity {
    // Au secours les noms ;-;

    @Id
    private Long id;

    @Column(updatable = false)
    private LocalDateTime dateTime;

    @Column(unique = true)
    private String code;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    private EcosSessionProgrammationEntity ecosSessionProgrammationEntities;

}   
