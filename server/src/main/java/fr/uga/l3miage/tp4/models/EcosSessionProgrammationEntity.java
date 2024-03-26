package fr.uga.l3miage.tp4.models;

import javax.persistence.*;

@Entity
public class EcosSessionProgrammationEntity {
    @Id
    private Long id;

    private String label;

    //TODO OneToMany relationship with EchosSessionProgrammationStepEntity
}