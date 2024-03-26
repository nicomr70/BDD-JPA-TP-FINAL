package fr.uga.l3miage.tp4.entities;

import fr.uga.l3miage.tp4.enums.SessionStatus;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EcoSessionEntity {
    @Id
    private Long id;
    @Column(unique = true)
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Enumerated(EnumType.ORDINAL)
    private SessionStatus sessionStatus;
    @OneToOne
    private EcoSessionProgrammationEntity ecoSessionProgrammationEntity;
    @OneToMany(mappedBy = "ecoSessionEntity")
    private Set<ExamEntity> examEntities;

}
