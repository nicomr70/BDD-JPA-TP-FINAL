package fr.uga.l3miage.tp4.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class EcosSessionProgrammationStepEntity {
    @Id
    Long id;
    @Column(updatable = false)
    final LocalDateTime dateTime = LocalDateTime.now();
    @Column(unique = true)
    String code;
    @Column(nullable = false)
    String description;
    @ManyToOne
    EcosSessionProgrammationEntity ecosSessionProgrammation;
}
