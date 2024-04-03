package fr.uga.l3miage.tp4.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EcoSessionProgrammationStepEntity {
    @Id
    private Long id;
    @Column(updatable = false)
    private  LocalDateTime dateTime;
    @Column(unique = true)
    private String code;
    @Column(nullable = false)
    private String description;
    @ManyToOne
    private EcoSessionProgrammationEntity ecoSessionProgrammationEntity;
}
