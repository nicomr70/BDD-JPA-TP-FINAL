package fr.uga.l3miage.tp4.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EcosSessionProgrammationStepEntity {
    @Id
    private Long Id;
    @Column(updatable = false)
    private LocalDateTime dateTime;
    @Column(unique = true)
    private String code;
    @Column(nullable = false)
    private String description;
    @ManyToOne
    private EcosSessionProgrammationEntity sessionProgrammation;
}
