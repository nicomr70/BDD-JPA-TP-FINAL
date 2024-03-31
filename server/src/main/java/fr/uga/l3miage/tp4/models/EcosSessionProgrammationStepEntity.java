package fr.uga.l3miage.tp4.models;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EcosSessionProgrammationStepEntity {
    // Au secours les noms ;-;

    @Id
    private Long id;

    @Column(updatable = false)
    private LocalDateTime dateTime;

    @Column(unique = true)
    private String code;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    private EcosSessionProgrammationEntity ecosSessionProgrammationEntities;

}   
