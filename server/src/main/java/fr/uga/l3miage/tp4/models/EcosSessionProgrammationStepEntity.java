package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class EcosSessionProgrammationStepEntity {
    @Id
    private Long id;

    @Column(nullable = false, updatable = false)    // car "final", fixée une fois pour toutes après son initialisation
    private LocalDateTime dateTime;

    @Column(unique = true)
    private String code;

    @Column(nullable = false)
    private String description;
}
