package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EcosSessionsProgrammationEntity {
    @Id
    private Long id;
    private String label;
}
