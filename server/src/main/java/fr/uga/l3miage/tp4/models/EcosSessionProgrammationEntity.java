package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EcosSessionProgrammationEntity {
    @Id
    private Long id;
    private String label;

    @OneToOne
    private EcosSessionEntity ecosSession;


}
