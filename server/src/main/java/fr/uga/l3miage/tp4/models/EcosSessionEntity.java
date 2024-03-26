package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatusType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EcosSessionEntity {
    @Id
    private Long id;

    @Column(unique = true)
    private String name;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private SessionStatusType status;

    @OneToOne   // Relation: EstProgramméPar, relation OneToOne bidirectionnelle entre EcosSessionEntity et EcosSessionProgrammationEntity
    private EcosSessionProgrammationEntity ecoSessionProgrammation;

    @OneToMany(mappedBy = "ecosSession")
    private Set<ExamEntity> exams;
    /* Relation: 'estComposéeDe' bidirectionnlle, tq:
     * Chaque session 'ecosSession' peut être composée de plusieurs examens.
     * Chaque examen appartient à une seule session 'ecosSession'.
     */
}

