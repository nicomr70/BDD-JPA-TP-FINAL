package fr.uga.l3miage.tp4.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EcosSessionProgrammationEntity {

    @Id
    private Long id;

    private String label;

    @OneToMany(mappedBy = "programmation")
    private Set<EcosSessionProgrammationStepEntity> steps;
}
