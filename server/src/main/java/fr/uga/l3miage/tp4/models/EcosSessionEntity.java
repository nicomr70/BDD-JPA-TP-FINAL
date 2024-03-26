package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enums.SessionStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

import lombok.Data;

@Entity
@Data
public class EcosSessionEntity {

    @Id
    private Long id;
    @Column(unique = true)
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @Enumerated(EnumType.ORDINAL)
    private SessionStatus status;

    @OneToMany(mappedBy = "ecosSessionEntity")
    private Set<ExamEntity> examEntities;

    @OneToOne
    private EcosSessionProgrammationEntity ecosSessionProgrammationEntity;

}