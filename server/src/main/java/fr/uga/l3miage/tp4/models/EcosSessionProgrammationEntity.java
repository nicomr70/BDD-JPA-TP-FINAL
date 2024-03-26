package fr.uga.l3miage.tp4.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
public class EcosSessionProgrammationEntity {
    @Id
    private Long id;

    private String label;

    @OneToMany
    private Set<EcosSessionProgrammationStepEntity> ecosSessionProgrammationStepEntities;

    @OneToOne(mappedBy = "programmation")
    private EcosSessionEntity ecosSessionEntity;
}
