package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EcosSessionProgrammationEntity {

    @Id
    private Long id;

    String label;

    @OneToMany(mappedBy = "ecosSessionProg")
    private Set<EcosSessionProgrammationStepEntity> ecosStepSessions;

    @OneToOne
    private EcosSessionEntity ecosSession;

}