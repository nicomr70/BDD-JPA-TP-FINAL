package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class EcosSessionProgrammationStepEntity {
    @Id
    private Long id;

    @Column(nullable = false, updatable = false)    // car "final", fixée une fois pour toutes après son initialisation
    private LocalDateTime dateTime;

    @Column(unique = true)
    private String code;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    private EcosSessionProgrammationEntity ecosSessionProgrammation;
    /*
    * Relation "AppartientA" entre EcosSessionProgrammationEntity et EcosSessionProgrammationStepEntity, tq:
    * Chaque programmation de session 'ecosSessionProgrammation' peut avoir plusieurs étapes.
    * Chaque étape appartient à une seule programmation de session 'ecosSessionProgrammation'.
    */
}