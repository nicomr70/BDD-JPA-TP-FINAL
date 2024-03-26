package fr.uga.l3miage.tp4.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class EcosSessionEntity {
    @Id
    Long id ;
    @Column(unique = true)
    String name ;
    LocalDateTime startDate;
    LocalDateTime endDate;
    SessionStatus status ;

}
