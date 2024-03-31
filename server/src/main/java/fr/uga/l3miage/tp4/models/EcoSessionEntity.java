package fr.uga.l3miage.tp4.models;


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

    private LocalDateTime endDate;

    private LocalDateTime startDate;

    @Enumerated(EnumType.ORDINAL)
    private SessionStatus status;

    @OneToMany(mappedBy = "ecoSessionEntity",cascade = CascadeType.ALL)
    private Set<ExamEntity> estComposéeDe;


    @OneToOne
    private EcoSessionEntity estProgramméePar;

}

