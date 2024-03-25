package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class EcoSessionProgrammationEntity {
    @Id
    private Long id;

    private String label;

    @OneToMany(mappedBy = "ecoSessionProgrammation")
    private Set<EcosSessionProgrammationStepEntity> ecosSessionProgrammationSteps;
}
