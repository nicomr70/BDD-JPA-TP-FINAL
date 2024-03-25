package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EcosSessionProgrammationEntity {
    @Id
    private long id;
    private String label;
}
