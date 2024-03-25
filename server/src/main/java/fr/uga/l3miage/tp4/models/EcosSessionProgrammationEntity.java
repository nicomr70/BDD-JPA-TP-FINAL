package fr.uga.l3miage.tp4.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class EcosSessionProgrammationEntity {

    @Id
    private Long id;

    private String label;

    @OneToOne
    private EcosSessionEntity ecosSessionEntity;

    @OneToMany(mappedBy = "ecoSessionProgrammationEntity")
    private Set<EcosSessionProgrammationStepEntity> ecoSessionProgrammationStepEntities;


}
