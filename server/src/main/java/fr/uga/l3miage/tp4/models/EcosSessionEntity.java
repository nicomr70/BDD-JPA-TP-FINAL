package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enumeration.SessionStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class EcosSessionEntity {
    @Id
    private long id;
    @Column(unique = true)
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    private SessionStatus status;



}
