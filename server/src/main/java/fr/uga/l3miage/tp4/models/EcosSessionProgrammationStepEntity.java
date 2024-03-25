package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class EcosSessionProgrammationStepEntity {
    @Id
    private Long Id;
    private final LocalDateTime dateTime;
    @Column(unique = true)
    private String code;

    @Column(nullable = false)
    private String description;

}
