package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

@Entity
public class EcosSessionProgrammationEntity {
    @Id
    private Long id;
    
    private String label;

    @OneToMany(mappedBy = "ecosSessionProgrammationEntities")
    private EcosSessionProgrammationStepEntity ecosSessionProgrammationStepEntities;

    @OneToOne
    private EcosSessionEntity ecosSessionEntity;
    
}