package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatusType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class EcosSessionEntity {
    @Id
    private Long id;

    @Column(unique = true)
    private String name;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private SessionStatusType status;
}
