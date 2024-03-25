package fr.uga.l3miage.tp4.models;

import fr.uga.l3miage.tp4.enumeration.SessionStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EcosSessionEntity {
    @Id
    private long id;
    @Column(unique = true)
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    private SessionStatus status;

    @OneToMany(mappedBy = "ecossession")
    private Set<ExamEntity> examEntities;

    @OneToOne
    private Set<EcosSessionProgrammationEntity> ecosSessionProgrammationEntities;

}
