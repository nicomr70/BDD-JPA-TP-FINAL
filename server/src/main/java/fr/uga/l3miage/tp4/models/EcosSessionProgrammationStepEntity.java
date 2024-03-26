package fr.uga.l3miage.tp4.models;

import lombok.*;

import javax.persistence.*;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EcosSessionProgrammationStepEntity {
    @Id
    private Long id;
    @Column(updatable = false)
    private LocalDateTime dateTime;
    @Column(unique = true)
    private String code;
    @Column(nullable = false)
    private String description;

    @ManyToOne
   private EcosSessionProgrammationEntity ecosSessionProgrammation;
}